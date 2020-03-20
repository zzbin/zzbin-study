package com.study.utils;

import java.util.UUID;

/**
 * @program: zzbin-study
 * @description:
 * @author: ZhangZB
 * @create: 2020-03-21 02:47
 **/
public class RandomUtils {
    public  static String randomString(){
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(randomString());
    }
}
