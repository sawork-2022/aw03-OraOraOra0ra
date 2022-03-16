package com.example.webpos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private Product product;
    private int quantity;

    @Override
    public String toString(){
        return product.toString() +"\t" + quantity;
    }

    public void addAmount(int n) { quantity += n;}

    public int getAmount() {
        return quantity;
    }
}
