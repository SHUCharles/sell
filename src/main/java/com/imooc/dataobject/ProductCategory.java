package com.imooc.dataobject;

//类目
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@DynamicUpdate
@Data
//@Table(name = "product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer categoryId;  //类目ID
    private String  categoryName;  //类目名字
    private Integer categoryType;  //类目编号

    private Date createTime;
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
