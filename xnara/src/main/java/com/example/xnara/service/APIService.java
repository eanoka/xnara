package com.example.xnara.service;

import com.example.xnara.model.ResultData;


public interface APIService {
    /**
     *
     * @param customer_id
     * @return ResultData
     *
     */
    public ResultData getResult(long customer_id);
}
