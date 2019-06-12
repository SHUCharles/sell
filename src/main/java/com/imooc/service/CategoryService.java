package com.imooc.service;
//类目
import com.imooc.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {
   ProductCategory findOne(Integer categoryId);
   List <ProductCategory> findAll();
   List <ProductCategory> findCategoryTypeIn(List <Integer> categoryTypeList);
   ProductCategory save (ProductCategory productCategory);
}
