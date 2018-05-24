package com.sml.mybatis.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by 神迷的亮
 * 2018-05-02 15:48
 */
@Data
public class SellerInfo
{

    private String id;

    private String username;

    private String password;

    private String openid;

    private Date createTime;

    private Date updateTime;

    public SellerInfo(String id, String username, String password, String openid, Date createTime, Date updateTime)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.openid = openid;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SellerInfo()
    {
        super();
    }
}