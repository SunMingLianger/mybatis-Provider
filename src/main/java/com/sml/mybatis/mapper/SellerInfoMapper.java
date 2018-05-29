package com.sml.mybatis.mapper;

import com.sml.mybatis.pojo.SellerInfo;
import com.sml.mybatis.pojo.SellerInfoExample;
import com.sml.mybatis.provider.SellerInfoProdiver;
import org.apache.ibatis.annotations.*;

import java.util.List;
public interface SellerInfoMapper
{
    int countByExample(SellerInfoExample example);

    int deleteByExample(SellerInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    List<SellerInfo> selectByExample(SellerInfoExample example);

    SellerInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);

    int updateByExample(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);

    int updateByPrimaryKeySelective(SellerInfo record);

    int updateByPrimaryKey(SellerInfo record);

    @SelectProvider(type = SellerInfoProdiver.class, method = "findSellerById")
    SellerInfo f1indSellerById(Integer id);

    @InsertProvider(type = SellerInfoProdiver.class, method = "insertSeller")
    int insertSeller(SellerInfo sellerInfo);

    @UpdateProvider(type = SellerInfoProdiver.class, method = "updateSeller")
    int updateSeller(SellerInfo sellerInfo);

    @DeleteProvider(type = SellerInfoProdiver.class, method = "deleteSeller")
    void deleteSeller(SellerInfo sellerInfo);
}