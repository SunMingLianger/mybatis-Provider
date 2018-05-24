package com.sml.mybatis.mapper;

import com.sml.mybatis.pojo.SellerInfo;
import com.sml.mybatis.provider.SellerInfoProdiver;
import org.apache.ibatis.annotations.*;

/**
 * Created by 神迷的亮
 * 2018-05-24 11:22
 */
@Mapper
public interface SellerInfoMapper
{

    @SelectProvider(type = SellerInfoProdiver.class, method = "findSellerById")
    SellerInfo f1indSellerById(Integer id);

    @InsertProvider(type = SellerInfoProdiver.class, method = "insertSeller")
    int insertSeller(SellerInfo sellerInfo);

    @UpdateProvider(type = SellerInfoProdiver.class, method = "updateSeller")
    int updateSeller(SellerInfo sellerInfo);

    @DeleteProvider(type = SellerInfoProdiver.class, method = "deleteSeller")
    void deleteSeller(SellerInfo sellerInfo);
}
