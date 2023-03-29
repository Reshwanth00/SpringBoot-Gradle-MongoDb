package com.example.demo.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "Employee")
public class User {

    private int id;
    private String name;
    private String address;

}
