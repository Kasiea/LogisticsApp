package com.example.yeqing.logisticsapp.entity;

/**
 * Created by yeqing on 2017/10/28.
 */

public class CustomerRequireEntity {

    private String origin;
    private String destination;
    private String car_length;
    private String car_type;
    private String goods_type;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCar_length() {
        return car_length;
    }

    public void setCar_length(String car_length) {
        this.car_length = car_length;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public String getLoading_time() {
        return loading_time;
    }

    public void setLoading_time(String loading_time) {
        this.loading_time = loading_time;
    }

    public String getCustomer_pic() {
        return customer_pic;
    }

    public void setCustomer_pic(String customer_pic) {
        this.customer_pic = customer_pic;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    private String loading_time;
    private String customer_pic;
    private String customer_name;
    private String release_time;
}
