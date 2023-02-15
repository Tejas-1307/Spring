package com.codekul.springCodekul.contact.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name Cannot be null")
    private String name;

    @NotNull(message = "Select the sector")
    private String sector;

    @Email
    @NotNull(message = "Email cannot be null")
    private String email;

    @Max(value = 12345678998745L)
    @Max(value = 1234567895L)
    private Long mobileNo;

    @NotNull(message = "Comment Cannot be null")
    private String comments;
}
