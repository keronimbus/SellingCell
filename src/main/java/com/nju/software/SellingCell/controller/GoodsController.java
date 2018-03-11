package com.nju.software.SellingCell.controller;

import com.nju.software.SellingCell.controller.vo.Goods;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class GoodsController {

    @RequestMapping(value="api/goodInfo/{goodId}",method= RequestMethod.GET)
    public Object findGoodInfo(@PathVariable String goodId){
        HashMap<String,Object> result= new HashMap<String,Object>();
        Goods goods=new Goods();
        goods.setTitle("Head First Java");
        goods.setImg("img/goods/xxxx");
        goods.setDetail("no detail");
        goods.setIntroduction("This is a book about java");
        goods.setPrice(56.8);
        result.put("success",true);
        result.put("data",goods);
        return result;
    }

    @RequestMapping(value="api/goodInfo/all",method = RequestMethod.GET)
    public List<Goods> getAllGoods(){
        return null;

    }

    @RequestMapping(value="api/goodInfo/customer",method = RequestMethod.GET)
    public List<Goods> getCustomerGoodsList(){
        return null;

    }

    @RequestMapping(value="api/goodInfo/seller",method = RequestMethod.GET)
    public List<Goods> getSellerGoodsList(){
        return null;
    }
}