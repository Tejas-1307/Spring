package com.codekul.springCodekul.onetomany_3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Taluka")
public class Taluka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @NotNull(message = "talukaName cannot be null")
    @Column(length = 15)
    private String talukaName;

    @ManyToOne
    @JoinColumn(name = "District_id")
    @JsonBackReference
    private District district;


}
