package com.example.xnara.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedList;

public class Pack {
    @JsonProperty("customer_id")
    private long customer_id;
    @JsonProperty("id")
    private String id;
    @JsonProperty("pack_data")
    private LinkedList<PackData> pack_data;

    public Pack() {
    }

    public Pack(long customer_id, String id, LinkedList<PackData> pack_data) {
        this.customer_id = customer_id;
        this.id = id;
        this.pack_data = pack_data;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public String getId() {
        return id;
    }

    public LinkedList<PackData> getPack_data() {
        return pack_data;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPack_data(LinkedList<PackData> pack_data) {
        this.pack_data = pack_data;
    }
}
