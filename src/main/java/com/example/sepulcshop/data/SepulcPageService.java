package com.example.sepulcshop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SepulcPageService {

    private SepulcRepository sepulcRepository;

    @Autowired
    public SepulcPageService(SepulcRepository sepulcRepository) {
        this.sepulcRepository = sepulcRepository;
    }

   public Sepulc getSepulcById(Integer id)
   {
       return sepulcRepository.findById(id).get();
   }
}
