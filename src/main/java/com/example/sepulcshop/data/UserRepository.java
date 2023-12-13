package com.example.sepulcshop.data;

import com.example.sepulcshop.security.SepulcstoreUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<SepulcstoreUser,Integer> {
}
