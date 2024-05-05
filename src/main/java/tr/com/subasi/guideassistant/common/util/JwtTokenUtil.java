package tr.com.subasi.guideassistant.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import tr.com.subasi.guideassistant.common.session.model.UserDetailsModel;

import java.security.Key;
import java.util.Date;

public class JwtTokenUtil {

    private static final String SECRET_KEY = "EQSngH2qInZj7viZocUWiMyy3YG3Rzt8Y3mhwCrf7Y4Zuq0JQXqXgXkqtl1xRBjcXZaj7ZJy2dPsl/Ps8Fhd+UkFI+lj1fecIr0xVLVVmlLuzgyTHyQymUsst1HDOgHy4Vxwn2pNfI4W/qOo3669XpoFRoNQPZ58I4koePIk9sI="; // Değiştirebilirsiniz
    private static final long EXPIRATION_TIME = 86400000; // Token'ın geçerlilik süresi, burada 24 saat olarak belirlenmiştir

    public static String generateToken(UserDetailsModel userDetailsModel) {
        return Jwts.builder()
                .claim("userId", userDetailsModel.getId())
                .claim("email", userDetailsModel.getEmail())
                .claim("phoneNumber", userDetailsModel.getPhoneNumber())
                .setSubject(userDetailsModel.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private static Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public static Boolean validateToken(String token, UserDetails userDetails) {
        String username = extractUser(token);
        Date expirationDate = extractExpiration(token);
        return isUsername(username, userDetails) && isExpired(expirationDate);
    }

    private static boolean isUsername(String username, UserDetails userDetails) {
        return userDetails.getUsername().equals(username);
    }

    private static Boolean isExpired(Date expirationDate) {
        return expirationDate.after(new Date());
    }

    private static Date extractExpiration(String token) {
        Claims claims = Jwts
                .parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getExpiration();
    }

    public static String extractUser(String token) {
        Claims claims = Jwts
                .parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }
}
