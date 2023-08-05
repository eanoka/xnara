package com.example.xnara.repository;


import com.example.xnara.model.Pack;
import com.example.xnara.model.PackData;
import com.example.xnara.model.ResultData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * Repository or Unit class
 * This class will be having unit functions implemtation and database functionalities
 */
@Repository
public class APIRepo {

    private static final Logger logger = LogManager.getLogger(APIRepo.class);

    private  RestTemplate restTemplate = new RestTemplate();

    /**
     * Method to return final processed packs
     * @param customer_id
     * @return ResultData
     */
    public ResultData returnResultData(long customer_id){
        logger.info("In returnResultData method in APIRepo Class");
        ResultData result = new ResultData();
        try{
            ArrayList<String> pack1 = new ArrayList<>();
            ArrayList<String> pack2 = new ArrayList<>();

            Pack[] pack1ResultFromAPI=  restTemplate.getForObject("https://6466e9a7ba7110b663ab51f2.mockapi.io/api/v1/pack1?customer_id="+customer_id, Pack[].class);
            Pack[] pack2ResultFromAPI=  restTemplate.getForObject("https://6466e9a7ba7110b663ab51f2.mockapi.io/api/v1/pack1?customer_id="+customer_id, Pack[].class);

            for(Pack pack : pack1ResultFromAPI){
                for(PackData packData : pack.getPack_data()){
                    pack1.add(packData.getIngredient()+" "+packData.getQuantity()+""+packData.getUnit());
                }
            }

            for(Pack pack : pack2ResultFromAPI){
                for(PackData packData : pack.getPack_data()){
                    pack2.add(packData.getIngredient()+" "+packData.getQuantity()+""+packData.getUnit());
                }
            }

            result.setId(pack1ResultFromAPI[0].getId());
            result.setCustomer_id(pack1ResultFromAPI[0].getCustomer_id());
            result.setPack1(pack1);
            result.setPack2(pack2);
        }catch (Exception e){
            logger.error("Error in returnResultData method in APIRepo class"+e);
        }
        return result;
    }
}

