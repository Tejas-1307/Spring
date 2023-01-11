package com.codekul.springCodekul.Validation;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name cannot be null")
    @Column(length = 100)
    private String name;

    @NotNull(message = "Country code cannot be null")
    private String countryCode;

    @Email(message = "Email format Incorrect")
    @NotNull(message = "Email cannot be null")
    private String email;

    @Max(value = 1248465416454L)
    @Min(value = 1000)
    private Long population;

    @Max(value = 3)
    private String isdCode;

}
