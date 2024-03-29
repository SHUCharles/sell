package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTset(){
        ProductCategory productCategory = new ProductCategory("娃哈哈",3);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(8);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List <Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}