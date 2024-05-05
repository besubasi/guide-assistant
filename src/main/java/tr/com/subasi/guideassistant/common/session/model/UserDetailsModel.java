package tr.com.subasi.guideassistant.common.session.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import tr.com.subasi.guideassistant.common.enums.EnumRoleType;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsModel implements UserDetails {

    private Long id;
    private String name;
    private String username;

    @JsonIgnore
    private String password;
    private String phoneNumber;

    private String email;

    private boolean accountNonExpired;
    private boolean isEnabled;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;

    private Set<EnumRoleType> authorities;

}
