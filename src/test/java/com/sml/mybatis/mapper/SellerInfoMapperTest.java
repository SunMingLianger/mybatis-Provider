package com.sml.mybatis.mapper;

import com.sml.mybatis.MybatisApplicationTests;
import com.sml.mybatis.pojo.SellerInfo;
import com.sml.mybatis.pojo.SellerInfoExample;
import com.sml.mybatis.utils.IDGenerateutil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by 神迷的亮
 * 2018-05-24 11:31
 */
@Component
public class SellerInfoMapperTest extends MybatisApplicationTests
{
   /* @Autowired
    SqlSessionFactory sessionFactory;

    @Test
    public void f1indSellerById()
    {
        SellerInfo sellerInfo = sessionFactory.openSession().getMapper(SellerInfoMapper.class).f1indSellerById(1);

        if (sellerInfo == null)
        {
            throw new RuntimeException("无法查询到该用户的信息，请核对后再来咨询！");
        }
        System.out.println(sellerInfo);
    }*/

    @Autowired
    private SellerInfoMapper mapper;

    @Test
    public void test11()
    {
        System.out.println(mapper.f1indSellerById(2));
    }

    @Test
    public void test1() throws Exception
    {
        for (int i = 0; i < 10; i++)
        {
            SellerInfo sellerInfo = new SellerInfo(IDGenerateutil.getIntKey(), null, "123456", "110", new Date(), new Date());

            int e = mapper.insertSeller(sellerInfo);

            System.out.println(e);

        }

    }

    @Test
    public void test2()
    {
        SellerInfo sellerInfo = new SellerInfo();

        sellerInfo.setOpenid("110");
        sellerInfo.setUsername("孙明亮");
        mapper.updateSeller(sellerInfo);
    }

    @Test
    public void test()
    {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setOpenid("110");
        mapper.deleteSeller(sellerInfo);
    }

    @Test
    public void test21()
    {
        SellerInfoExample example = new SellerInfoExample();
        example.createCriteria().andUsernameLike("%n");
        int i = mapper.countByExample(example);
        System.out.println(i);
    }
}