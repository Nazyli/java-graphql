package com.sample.app.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "seller")
public class Seller extends BaseEntity{
    private String name;
    private String address;
}
