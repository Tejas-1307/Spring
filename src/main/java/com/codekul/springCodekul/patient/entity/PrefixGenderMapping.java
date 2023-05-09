package com.codekul.springCodekul.patient.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class PrefixGenderMapping implements Serializable {

    @EmbeddedId
    private PrefixGenderMappingId prefixGenderMappingId;
}
