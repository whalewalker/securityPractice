package com.securitypractice.data.model;

import lombok.Data;




@Data
public class User {

    private Long id;

    private String username;
    private String password;
    private boolean active;
    private String roles;
}
