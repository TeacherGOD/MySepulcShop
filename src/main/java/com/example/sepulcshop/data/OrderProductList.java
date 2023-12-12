package com.example.sepulcshop.data;



import javax.persistence.*;

@Entity
@Table(name = "orderProductList")
public class OrderProductList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idOrder;

    private  Integer idProduct;

    private Integer quantity;

    private Integer idColor;

    private Integer extraSepulcQuantity;
    private Integer idExtaSepulc;
}
