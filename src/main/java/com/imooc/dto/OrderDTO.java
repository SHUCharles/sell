package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.EnumUtil;
import com.imooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    private String orderId;  //订单ID
    private String buyerName; //买家名字
    private String buyerPhone;  // 买家手机号
    private String buyerAddress; //买家地址
    private String buyerOpenid;  //买家微信id
    private BigDecimal orderAmount; // 订单总金额
    /*  订单状态，默认为0新下单  */
    private Integer orderStatus;
    /*  支付状态，默认为0未支付  */
    private Integer payStatus;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime; //创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime; //更新时间

    List<OrderDetail> orderDetailList;
    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
