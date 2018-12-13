package com.teksoi.restapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Permission extends BaseModel {

    private String name;

    @ManyToMany(mappedBy = "permissions")
    private List<Role> roles = new ArrayList<>();
}