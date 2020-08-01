package com.ea.db.mysql.service;

import com.ea.db.mysql.model.MyUser;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class MyUserService implements UserDetailsService {
    private final Map<String, UserDetails> userDetailsMap = new ConcurrentHashMap<>();

    public MyUserService(Collection<UserDetails> userDetails) {
        userDetails.forEach(user -> this.userDetailsMap.put(user.getUsername(), user));
        //see passwords here in log
    }


    /*public MyUserService(){
        userDetailsMap.put("kaybee",
                new MyUser("kaybee", "password", true, "USER", "ADMIN"));
        userDetailsMap.put("udit",
                new MyUser("udit","password", true, "USER"));
    }*/

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (this.userDetailsMap.containsKey(username)) {
            return this.userDetailsMap.get(username);
        }
        throw new UsernameNotFoundException(String.format("Username is invalid -> {}", username));
    }
}
