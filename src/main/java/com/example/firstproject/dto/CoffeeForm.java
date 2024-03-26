package com.example.firstproject.dto;

import com.example.firstproject.entity.Coffee;
import lombok.Getter;

@Getter
public class CoffeeForm {

    private Long id;
    private String name;
    private String price;

    public Coffee toEntity() {

        return new Coffee(id, name, price);
    }
}
