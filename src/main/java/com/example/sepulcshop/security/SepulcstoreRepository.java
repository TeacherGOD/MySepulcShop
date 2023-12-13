package com.example.sepulcshop.security;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SepulcstoreRepository extends JpaRepository<SepulcstoreUser,Integer> {



    SepulcstoreUser findSepulcstoreUserByLogin(String login);
}
