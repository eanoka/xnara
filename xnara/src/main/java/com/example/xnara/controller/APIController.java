package com.example.xnara.controller;

import com.example.xnara.model.ResultData;
import com.example.xnara.service.APIService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "xnara/test")
public class APIController {

    @Autowired
    private APIService service;
    private static final Logger logger = LogManager.getLogger(APIController.class);

    /**
     * @return ResultData
     * @param  customer_id
     * API to get pack details*/
    @GetMapping(value = "/get", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultData> getDetail(@RequestParam("customer_id") long customer_id ){

        try{
            ResultData response  = new ResultData();
            response = service.getResult(customer_id);
            return new ResponseEntity<>(response, HttpStatus.OK);

        }catch (Exception e){
            logger.error("Error while hitting get api :"+e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
