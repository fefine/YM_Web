package com.ym.er.mapper;

import com.ym.er.model.ProductShow;
import com.ym.er.model.ProductShowExample;
import java.util.List;

public interface ProductShowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_show
     *
     * @mbggenerated
     */
    int countByExample(ProductShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_show
     *
     * @mbggenerated
     */
    List<ProductShow> selectByExample(ProductShowExample example);
}