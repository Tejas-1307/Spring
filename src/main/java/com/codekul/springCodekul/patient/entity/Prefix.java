package com.codekul.springCodekul.patient.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prefix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String prefix;

    @Transient
    private Integer gender;
}
