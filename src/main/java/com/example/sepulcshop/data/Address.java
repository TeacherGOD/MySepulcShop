package com.example.sepulcshop.data;


import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String City;
    private String street;
    private Integer houseNum;
    private Integer addressIndex;
}
