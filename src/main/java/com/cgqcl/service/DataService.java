package com.cgqcl.service;

import com.cgqcl.entity.Data;

import java.util.List;

/*
 * @author: cm
 * @date: Created in 2021/5/7 20:35
 * @description:
 */
public interface DataService {
    //初次获取数据
    Data fistGet();
    //获取数据并将数据右移
    Data getData(Data data);
}
