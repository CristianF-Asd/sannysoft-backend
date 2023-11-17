package com.example.demo.intities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "mesa")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_me;
    private String num_me;
    private String est_me;
    private String est_reg_me;
}
