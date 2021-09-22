package com.securitypractice.config;

import com.securitypractice.data.model.User;
import com.securitypractice.data.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.lang.String.format;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
       Optional <User> user = userRepo.findByUsername(s);
        if (user.isPresent()){
            return user.map(CustomUserDetail::new).get();
        }
        else throw new UsernameNotFoundException(format("User with username %s is not found", s));
    }
}
