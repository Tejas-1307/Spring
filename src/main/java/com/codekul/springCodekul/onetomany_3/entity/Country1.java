package com.codekul.springCodekul.onetomany_3.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Country1")
public class Country1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @NotNull(message = "CountryName cannot be null")
    @Column(length = 50)
    private String countryName;

    @NotNull(message = "CountryCode cannot be null")
    @Column(length = 3)
    private String countryCode;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<States1> states1;

}
