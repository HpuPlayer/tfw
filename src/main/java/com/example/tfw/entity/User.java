package com.example.tfw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private String uuid;

    private String username;

    private String password;

    private String role;

    private int level;

}
