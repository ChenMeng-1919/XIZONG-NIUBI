package com.cgqcl.service;

import com.cgqcl.entity.Data;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/*
 * @author: cm
 * @date: Created in 2021/5/7 20:35
 * @description:
 */
@Service
public class DataServiceImpl implements DataService {
    @Override
    public Data fistGet() {
        //生成随机8个double数值
        /*List<Double> listX = new ArrayList<>();
        List<List<Double>> listArrayTemp = new ArrayList<>();
        List<List<Double>> listArray = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            List<Double> list = new ArrayList<>();
            double a = (double) i;
            listX.add(a);
            list.clear();
            for (int i1 = 0; i1 < 8; i1++) {
                double v = Math.random() * (8);
                list.add(v);
            }
            listArrayTemp.add(list);
        }
        listArray.add(listX);
        
        listArray.addAll(listArrayTemp);*/
        Data data = new Data();
        List<Double> listA = data.getListA();
        List<Double> listB = data.getListB();
        List<Double> listC = data.getListC();
        List<Double> listD = data.getListD();
        for (int i = 0; i < 8; i++) {
            listA.add(Math.random() * (250));
            listB.add(Math.random() * (250));
            listC.add(Math.random() * (250));
            listD.add(Math.random() * (250));
        }
        data.setListA(listA);
        data.setListB(listB);
        data.setListC(listC);
        data.setListD(listD);
        return data;
    }

    @Override
    public Data getData(Data data) {
        List<Double> listA = data.getListA();
        listA.remove(0);
        listA.add(Math.random() * (250));
        data.setListA(listA);
        List<Double> listB = data.getListA();
        listB.remove(0);
        listB.add(Math.random() * (250));
        data.setListB(listB);
        List<Double> listC = data.getListA();
        listC.remove(0);
        listC.add(Math.random() * (250));
        data.setListC(listC);
        List<Double> listD = data.getListA();
        listD.remove(0);
        listD.add(Math.random() * (250));
        data.setListD(listD);
        return data;
    }
}
