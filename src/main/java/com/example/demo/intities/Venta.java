package com.example.demo.intities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "venta")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vent;
    private Double prec_tot_vent;
    @ManyToOne
    @JoinColumn(name = "usu_vent")
    private User User;
    private double desc_vent;
    private String est_reg_vent;
}
