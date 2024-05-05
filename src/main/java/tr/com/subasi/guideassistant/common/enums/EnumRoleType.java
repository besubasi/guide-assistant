package tr.com.subasi.guideassistant.common.enums;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@Getter
public enum EnumRoleType implements GrantedAuthority {
    ADMIN("ADMIN"),
    COMPANY_OPERATOR("COMPANY_OPERATOR"),
    GUIDE("GUIDE"),
    TRAVELER("TRAVELER");

    private final String value;

    EnumRoleType(String value) {
        this.value = value;
    }


    @Override
    public String getAuthority() {
        return name();
    }
}

