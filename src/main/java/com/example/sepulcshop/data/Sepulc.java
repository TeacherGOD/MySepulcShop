package com.example.sepulcshop.data;



import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "sepulc")
public class Sepulc {

//    private Integer id;
//    private String author;
//    private String title;
//    private String priceOld;
//    private String price;
//
//    @Override
//    public String toString() {
//        return "Sepulc{" +
//                "id=" + id +
//                ", author='" + author + '\'' +
//                ", title='" + title + '\'' +
//                ", priceOld='" + priceOld + '\'' +
//                ", price='" + price + '\'' +
//                '}';
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getPriceOld() {
//        return priceOld;
//    }
//
//    public void setPriceOld(String priceOld) {
//        this.priceOld = priceOld;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private String imagePath;



    @Override
    public String toString() {
        return "Sepulc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image_path='" + imagePath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
