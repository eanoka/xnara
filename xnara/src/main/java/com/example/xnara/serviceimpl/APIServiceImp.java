package com.example.xnara.serviceimpl;

import com.example.xnara.model.ResultData;
import com.example.xnara.repository.APIRepo;
import com.example.xnara.service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service implementation class
 * This class will be having all the business logics
 */
@Service
public class APIServiceImp implements APIService {
    @Autowired
    private APIRepo repo;

    /**
     *
     * @param customer_id
     * @return ResultData
     * Method will return proccesed pack details from two different kinds of packs
     */
    @Override
    public ResultData getResult(long customer_id) {

        return repo.returnResultData(customer_id);
    }
}

