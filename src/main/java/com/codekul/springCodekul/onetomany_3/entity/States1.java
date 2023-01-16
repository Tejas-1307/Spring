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
@Table(name = "States1")
public class States1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "stateName cannot be null")
    @Column(length = 40)
    private String stateName;

    @NotNull(message = "legend cannot be null")
    @Column(length = 3)
    private String legend;

    @ManyToOne
    @JoinColumn(name = "Country1_id")
    @JsonBackReference
    private Country1 country1;
}
