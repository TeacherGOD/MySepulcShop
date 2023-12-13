package com.example.sepulcshop.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

public class SepulcstoreUserDetalics implements UserDetails {

    private final SepulcstoreUser sepulcstoreUser;

    public SepulcstoreUserDetalics(SepulcstoreUser sepulcstoreUser) {
        this.sepulcstoreUser=sepulcstoreUser;
    }

    public SepulcstoreUser getSepulcstoreUser() {
        return sepulcstoreUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return sepulcstoreUser.getPassword();
    }

    @Override
    public String getUsername() {
        return sepulcstoreUser.getName();
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
