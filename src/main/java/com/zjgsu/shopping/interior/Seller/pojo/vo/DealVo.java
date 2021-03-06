package com.zjgsu.shopping.interior.Seller.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealVo {
    private Integer intentionId;
    private Integer dealId;
    private Integer buyerId;
    private Integer sellerId;
    private Integer goodId;
    private Integer number;
    private Date date;
}
