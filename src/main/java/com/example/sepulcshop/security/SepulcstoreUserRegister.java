package com.example.sepulcshop.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class SepulcstoreUserRegister {

    private final SepulcstoreRepository sepulcstoreRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public SepulcstoreUserRegister(SepulcstoreRepository sepulcstoreRepository, PasswordEncoder passwordEncoder) {
        this.sepulcstoreRepository = sepulcstoreRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerNewUser(RegistrationForm registrationForm)
    {
        if (sepulcstoreRepository.findSepulcstoreUserByLogin(registrationForm.getLogin())==null)
        {
            SepulcstoreUser user=new SepulcstoreUser();
            user.setName(registrationForm.getName());
            user.setLogin(registrationForm.getLogin());
            user.setPassword(passwordEncoder.encode(registrationForm.getPassword()));
            sepulcstoreRepository.save(user);
        }
    }

}
