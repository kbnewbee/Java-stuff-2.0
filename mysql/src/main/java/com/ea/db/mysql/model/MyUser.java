package com.ea.db.mysql.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUser implements UserDetails {

    private final String username, password;
    private final boolean active;
    private final Set<GrantedAuthority> authorities;

    public MyUser(String username, String password, boolean active, String... authorities) {
        this.username = username;
        this.password = password;
        this.active = active;
        this.authorities = Stream
                .of(authorities)
                .map(au -> new SimpleGrantedAuthority("ROLE_" + au))
                .collect(Collectors.toSet());
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
