package com.example.demo.intities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "producto")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pro;
    private String nom_pro;
    private String des_pro;
    private double prec_pro;
    @ManyToOne
    @JoinColumn(name = "cat_pro_cod")
    private Category category;
    private String est_reg_pro;
    private int stock_pro;
    private String cod_bar_pro;

}
