package com.example.demo.intities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usu;
    private String nom_usu;
    private String ape_usu;
    private String dir_usu;
    private String dni_usu;
    private String contr_usu;
    @ManyToOne
    @JoinColumn(name = "rol_usu")
    private RolUser rolUser;
    private String est_reg_usu;

}
