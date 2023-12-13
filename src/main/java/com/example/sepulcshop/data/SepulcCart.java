package com.example.sepulcshop.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;




@Component
@SessionScope
public class SepulcCart {

    Set<Sepulc> sepulcCart;

    @Autowired
    public SepulcCart(Set<Sepulc> sepulcCart) {
        this.sepulcCart = sepulcCart;
    }

    public void add(Sepulc sepulc) { sepulcCart.add(sepulc);}

    public void clear() { sepulcCart.clear();}

    public Set<Sepulc> getSepulcCart()
    {
        return sepulcCart;
    }
}
