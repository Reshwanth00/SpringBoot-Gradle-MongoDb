package com.example.demo.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "Employee")
public class User {
    @Id
    private int id;
    private String name;
    private String address;

}
