package tr.com.subasi.guideassistant.common.session.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.user.entity.UserEntity;
import tr.com.subasi.guideassistant.app.user.repository.UserRepository;
import tr.com.subasi.guideassistant.common.session.model.UserDetailsModel;

import java.util.Collections;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;


    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetailsModel loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUsername(username);
        if (userEntity == null)
            throw new UsernameNotFoundException(username + " not found");

        UserDetailsModel userDetailsModel = new UserDetailsModel();
        userDetailsModel.setId(userEntity.getId());
        userDetailsModel.setUsername(userEntity.getUsername());
        userDetailsModel.setEmail(userEntity.getEmail());
        userDetailsModel.setEnabled(userEntity.isActive());
        userDetailsModel.setName(userEntity.getName());
        userDetailsModel.setPassword(userEntity.getPassword());
        userDetailsModel.setAccountNonLocked(true);
        userDetailsModel.setAccountNonExpired(true);
        userDetailsModel.setCredentialsNonExpired(true);
        userDetailsModel.setAuthorities(Collections.singleton(userEntity.getRoleType()));
        return userDetailsModel;
    }


}