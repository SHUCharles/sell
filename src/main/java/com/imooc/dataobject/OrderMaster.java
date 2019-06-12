package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    private String orderId;  //订单ID
    private String buyerName; //买家名字
    private String buyerPhone;  // 买家手机号
    private String buyerAddress; //买家地址
    private String buyerOpenid;  //买家微信id
    private BigDecimal orderAmount; // 订单总金额
    /*  订单状态，默认为0新下单  */
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();
    /*  支付状态，默认为0未支付  */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    private Date createTime; //创建时间
    private Date updateTime; //更新时间

}
