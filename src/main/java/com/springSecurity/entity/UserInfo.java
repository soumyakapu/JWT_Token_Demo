package com.springSecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Document(value = "Security")
public class UserInfo {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
    private String roles;
}
