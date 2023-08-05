package com.example.xnara.model;


import java.util.ArrayList;

public class ResultData {
    private String id;
    private long customer_id;
    private ArrayList<String> pack1;
    private ArrayList<String> pack2;

    public ResultData() {
    }

    public ResultData(String id, long customer_id, ArrayList<String> pack1, ArrayList<String> pack2) {
        this.id = id;
        this.customer_id = customer_id;
        this.pack1 = pack1;
        this.pack2 = pack2;
    }

    public String getId() {
        return id;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public ArrayList<String> getPack1() {
        return pack1;
    }

    public ArrayList<String> getPack2() {
        return pack2;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public void setPack1(ArrayList<String> pack1) {
        this.pack1 = pack1;
    }

    public void setPack2(ArrayList<String> pack2) {
        this.pack2 = pack2;
    }
}

