package com.cqupt.entity;

import javax.persistence.*;

/**
 * Created by 罗浩 on 2018/3/4.
 */
@Entity
@Table(name = "shop_info")

public class ShopInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private Integer shopId;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "shop_logourl")
    private String logoUrl;

    @Column(name = "minimum_price")
    private Integer minPrice;

    @Column(name = "delivery_time")
    private Integer deliveryPrice;

    @Column(name = "delivery_time")
    private Integer deliveryTime;

    @Column(name = "shop_notice")
    private String shopNotice;

    @Column(name = "all_comment")
    private Integer allComment;

    @Column(name = "service_comment")
    private Integer serviceComment;

    @Column(name = "shop_address")
    private String shopAddr;

    @Column(name = "sopen_time")
    private String openTime;

    @Override
    public String toString() {
        return "ShopInfo{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", minPrice=" + minPrice +
                ", deliveryPrice=" + deliveryPrice +
                ", deliveryTime=" + deliveryTime +
                ", shopNotice='" + shopNotice + '\'' +
                ", allComment=" + allComment +
                ", serviceComment=" + serviceComment +
                ", shopAddr='" + shopAddr + '\'' +
                ", openTime='" + openTime + '\'' +
                '}';
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Integer deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getShopNotice() {
        return shopNotice;
    }

    public void setShopNotice(String shopNotice) {
        this.shopNotice = shopNotice;
    }

    public Integer getAllComment() {
        return allComment;
    }

    public void setAllComment(Integer allComment) {
        this.allComment = allComment;
    }

    public Integer getServiceComment() {
        return serviceComment;
    }

    public void setServiceComment(Integer serviceComment) {
        this.serviceComment = serviceComment;
    }

    public String getShopAddr() {
        return shopAddr;
    }

    public void setShopAddr(String shopAddr) {
        this.shopAddr = shopAddr;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }
}

