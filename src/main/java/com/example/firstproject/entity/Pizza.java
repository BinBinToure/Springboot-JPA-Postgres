package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private double price;

    /*
    생성 - "/api/pizzas" POST
    단조 - "/api/pizzas/{id} GET
    목조 - "/api/pizzas GET
    수정 - "/api/pizzas/{id} PATCH
    삭제 - "/api/pizzas/{id} DELETE
    */
}
