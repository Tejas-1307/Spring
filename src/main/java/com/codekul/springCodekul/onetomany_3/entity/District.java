package com.codekul.springCodekul.onetomany_3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "District")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @NotNull(message = "districtName cannot be null")
    @Column(length = 10)
    private String districtName;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "District_id")
    @JsonBackReference
    private List<Taluka> taluka;

}
