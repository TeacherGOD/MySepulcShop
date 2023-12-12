package com.example.sepulcshop.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SepulcRepository extends JpaRepository<Sepulc,Integer > {
}
