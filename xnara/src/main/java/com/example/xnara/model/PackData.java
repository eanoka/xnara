package com.example.xnara.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PackData {
    @JsonProperty("inventory_code")
    private String inventory_code;
    @JsonProperty("ingredient")
    private String ingredient;
    @JsonProperty("quantity")
    private long quantity;
    @JsonProperty("unit")
    private String unit;

    public PackData(){

    }

    public PackData(String inventory_code, String ingredient, long quantity, String unit) {
        this.inventory_code = inventory_code;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getInventory_code() {
        return inventory_code;
    }

    public String getIngredient() {
        return ingredient;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setInventory_code(String inventory_code) {
        this.inventory_code = inventory_code;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}