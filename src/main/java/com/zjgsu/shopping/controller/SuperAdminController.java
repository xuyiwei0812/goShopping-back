package com.zjgsu.shopping.controller;


import com.zjgsu.shopping.Tool.Mytool;
import com.zjgsu.shopping.interior.Buyer.pojo.Buyer;
import com.zjgsu.shopping.interior.Buyer.pojo.vo.BuyerHistoryList;
import com.zjgsu.shopping.interior.SuperAdmin.pojo.vo.BuyerList;
import com.zjgsu.shopping.interior.SuperAdmin.service.SuperAdminService;
import com.zjgsu.shopping.interior.Common.pojo.vo.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
@CrossOrigin(origins = "*", maxAge = 3600)

@RequestMapping("/api/admin")
public class SuperAdminController {
    @Resource
    private Mytool tool;
    @Resource
    private SuperAdminService superAdminService;



    @ResponseBody
    @PostMapping("/getAllBuyerInfo")
    public Response<BuyerList> getAllBuyerInfo(){
        try{
            BuyerList list = tool.toBuyerList(superAdminService.getAllBuyerInfo());
            return Response.createSuc(list);
        }catch (Exception e){
            tool.soutErr("getAllBuyerInfo" ,e);
            return Response.BUG();
        }
    }

    @ResponseBody
    @PostMapping("/getAllBuyerHistory")
    public Response<BuyerHistoryList> getAllBuyerHistory() {
        try {
            BuyerHistoryList list = tool.toBuyerHistoryList(superAdminService.getAllBuyerHistory());
            return Response.createSuc(list);
        } catch (Exception e) {
            tool.soutErr("getAllBuyerHistory", e);
            return Response.BUG();
        }
    }

    @ResponseBody
    @PostMapping("/getBuyerHistoryByBuyerId")
    public Response<BuyerHistoryList> getBuyerHistoryByBuyerId(@RequestBody Buyer buyer) {
        try {
            BuyerHistoryList list = tool.toBuyerHistoryList(superAdminService.getBuyerHistoryByBuyerId(buyer.getBuyerId()));
            return Response.createSuc(list);
        } catch (Exception e) {
            tool.soutErr("getAllBuyerHistory", e);
            return Response.BUG();
        }
    }

}
