package com.teksoi.restapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User extends BaseModel {

    private String firstName;
    private String lastName;
    private String organisationName;
    private String email;
    private String password;
    private String status;
    /*private String userType;
    private int noOfAttempt;*/

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles = new ArrayList<>();
}