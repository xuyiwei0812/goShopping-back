package com.zjgsu.shopping.pojo;

import lombok.Data;

@Data
public class GoodForSale {
    /**
     * 商品编号(自增)
     * 商品价格
     * 商品名称
     * 商品描述
     * 商品是否处于冻结状态
     * 构造方式 GoodForSale(null,price,name,description,null)
     */
    private Integer goodId;
    private Integer sellerId;
    private Double price;
    private String name;
    private String description;
    private Boolean frozen;
    private Boolean sold;

    public GoodForSale(Integer goodId, Integer sellerId, Double price, String name, String description, Boolean frozen,Boolean sold) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.sellerId = sellerId;
        this.frozen = false;
        this.sold = false;
    }

    public GoodForSale() {
    }
}
