package com.codekul.springCodekul.mongo.modal;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Students")
@Getter
@Setter
public class Students {

    private Integer id;

    private String Name;

    private  String address;

    private  String collage;

}
