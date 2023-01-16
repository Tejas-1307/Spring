package com.codekul.springCodekul.onetomany_3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "City")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "cityName cannot be null")
    @Column(length = 15)
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "Taluka_id")
    @JsonBackReference
    private Taluka taluka;
}
