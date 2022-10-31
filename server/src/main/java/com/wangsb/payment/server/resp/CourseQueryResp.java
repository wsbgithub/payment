package com.wangsb.payment.server.resp;

import java.math.BigDecimal;

public class CourseQueryResp {


    private String name;

    private String level;

    private BigDecimal price;

    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", price=").append(price);
        sb.append(", desc=").append(desc);
        sb.append("]");
        return sb.toString();
    }
}