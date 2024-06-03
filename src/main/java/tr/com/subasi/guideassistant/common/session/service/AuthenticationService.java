package tr.com.subasi.guideassistant.common.session.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.common.session.entity.TokenEntity;
import tr.com.subasi.guideassistant.common.session.model.LoginModel;
import tr.com.subasi.guideassistant.common.session.model.LoginResponse;
import tr.com.subasi.guideassistant.common.session.model.UserDetailsModel;
import tr.com.subasi.guideassistant.common.session.repository.TokenRepository;
import tr.com.subasi.guideassistant.common.util.JwtTokenUtil;

@Service
@Slf4j
public class AuthenticationService {
    public static final String TRAVELER_ENTRY = "1234";

    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final TokenRepository tokenRepository;

    public AuthenticationService(AuthenticationManager authenticationManager, UserDetailsService userDetailsService, TokenRepository tokenRepository) {
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.tokenRepository = tokenRepository;
    }

    public LoginResponse login(LoginModel loginModel) {
        try{
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginModel.getUsername(), loginModel.getPassword()));
            if (authentication.isAuthenticated()) {
                UserDetailsModel userDetailsModel = (UserDetailsModel) userDetailsService.loadUserByUsername(loginModel.getUsername());
                String token = JwtTokenUtil.generateToken(userDetailsModel);
                allTokenExpired(userDetailsModel);
                saveToken(userDetailsModel, token);
                return LoginResponse.builder().user(userDetailsModel).token(token).build();
            }
        } catch (Exception e){
            log.error("login error for " + loginModel.getUsername(), e);
        }
        throw new UsernameNotFoundException("invalid username {}" + loginModel.getUsername());
    }

    public LoginResponse loginTraveler(String phoneNumber) {
        try{
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(phoneNumber, TRAVELER_ENTRY));
            if (authentication.isAuthenticated()) {
                UserDetailsModel userDetailsModel = (UserDetailsModel) userDetailsService.loadUserByUsername(phoneNumber);
                String token = JwtTokenUtil.generateToken(userDetailsModel);
                allTokenExpired(userDetailsModel);
                saveToken(userDetailsModel, token);
                return LoginResponse.builder().user(userDetailsModel).token(token).build();
            }
        } catch (Exception e){
            log.error("login error for " + phoneNumber, e);
        }
        throw new UsernameNotFoundException("invalid username {}" + phoneNumber);
    }

    public void saveToken(UserDetailsModel userDetailsModel, String token) {
        TokenEntity tokenEntity = TokenEntity.builder()
                .token(token)
                .userId(userDetailsModel.getId())
                .expired(false)
                .build();
        tokenRepository.save(tokenEntity);
    }

    private void allTokenExpired(UserDetailsModel userDetailsModel) {
        var validUsersToken = tokenRepository.findByExpiredIsFalseAndUserId(userDetailsModel.getId());
        if (validUsersToken.isEmpty())
            return;

        validUsersToken.forEach(t -> t.setExpired(true));
        tokenRepository.saveAll(validUsersToken);
    }
}