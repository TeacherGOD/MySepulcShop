package com.example.sepulcshop.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SepulcstoreUserDetalicService implements UserDetailsService {


    private final SepulcstoreRepository sepulcstoreRepocitory;

    @Autowired
    public SepulcstoreUserDetalicService(SepulcstoreRepository sepulcstoreRepocitory) {
        this.sepulcstoreRepocitory = sepulcstoreRepocitory;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        SepulcstoreUser sepulcstoreUser= sepulcstoreRepocitory.findSepulcstoreUserByLogin(s);
        if (sepulcstoreUser!=null) {
            return new SepulcstoreUserDetalics(sepulcstoreUser);
        }else {
            throw new UsernameNotFoundException("No user with this Name/pass/id idk");
        }
    }
}
