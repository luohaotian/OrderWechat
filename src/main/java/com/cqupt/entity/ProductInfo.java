package com.cqupt.entity;

import javax.persistence.*;

/**
 * Created by 罗浩 on 2018/3/4.
 */
@Entity
@Table(name = "product_info")
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "shop_id")
    private Integer shopId;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "product_icon")
    private String productIcon;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_detail")
    private String productDetail;

    @Column(name = "product_comment")
    private Integer productComment;

    @Column(name = "month_sale")
    private Integer monthSale;

    @Column(name = "product_price")
    private Integer productPrice;


}
