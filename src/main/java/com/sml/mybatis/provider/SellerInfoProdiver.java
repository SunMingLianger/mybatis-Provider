package com.sml.mybatis.provider;

import com.sml.mybatis.pojo.SellerInfo;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by 神迷的亮
 * 2018-05-24 11:22
 */
public class SellerInfoProdiver
{
    public String findSellerById(Integer id)
    {
        return "select * from seller_info where id = " + String.valueOf(id);
    }

    public String insertSeller(SellerInfo sellerInfo)
    {
        return new SQL()
        {
            {
                INSERT_INTO("seller_info");
                if (sellerInfo.getId() != null)
                {
                    VALUES("id", "#{id}");
                }
                if (sellerInfo.getUsername() != null)
                {
                    VALUES("username", "#{username}");
                }

                VALUES("openid", "#{openid}");

                VALUES("password", "#{password}");
                VALUES("create_time", "#{createTime}");
                VALUES("update_time", "#{updateTime}");
            }
        }.toString();
    }

    public String updateSeller(SellerInfo sellerInfo)
    {
        SQL sql = new SQL();

        sql.UPDATE("seller_info").SET("username = #{username}").WHERE("openid = #{openid}");

        return sql.toString();
    }

    public String deleteSeller(SellerInfo sellerInfo)
    {

        return new SQL()
        {
            {
                DELETE_FROM("seller_info");
                WHERE("openid = #{openid}");
            }
        }.toString();

    }
}
