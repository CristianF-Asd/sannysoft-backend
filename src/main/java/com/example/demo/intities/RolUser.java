package com.example.demo.intities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "rol")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RolUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;
    private String des_rol;
    private String est_reg_rol;


}
