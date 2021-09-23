package com.zjgsu.shopping.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class GoodForHistory {
    /**
     * 商品编号
     * 商品价格
     * 商品描述
     * 商品名称
     * 商品成交价格
     * 商品成交日期
     * 成交人电话
     * 全参数构造
     */

    private Integer goodId;
    private Integer sellerId;
    private double price;
    private String name;
    private String description;
    private String phone;
    private Date dealDate;



    public GoodForHistory(Integer goodId, Integer sellerId, String name, String description, double price, Date dealDate, String phone) {
        this.goodId = goodId;
        this.sellerId = sellerId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.dealDate = dealDate;
        this.phone = phone;
    }

    public GoodForHistory() {

    }
}
