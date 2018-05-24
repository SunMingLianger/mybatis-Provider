package com.sml.mybatis.utils;

import java.util.Random;
import java.util.UUID;

/**
 * Created by 神迷的亮
 * 2018-05-24 13:35
 */
public class IDGenerateutil
{
    public static String getIntKey()
    {

        return get();
    }

    private synchronized static String get()
    {
        int i = new Random().nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(i);
    }

    public static String getStrKey()
    {
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }

    public static void main(String[] args)
    {
    }
}
