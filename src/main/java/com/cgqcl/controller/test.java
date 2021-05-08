package com.cgqcl.controller;

import com.cgqcl.service.DataServiceImpl;

/*
 * @author: cm
 * @date: Created in 2021/5/7 22:09
 * @description:
 */
public class test {
    public static void main(String[] args) {
        DataServiceImpl dataService = new DataServiceImpl();
        System.out.println(dataService.fistGet());
    }

}

