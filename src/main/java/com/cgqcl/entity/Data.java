package com.cgqcl.entity;

import java.util.ArrayList;
import java.util.List;

/*
 * @author: cm
 * @date: Created in 2021/5/7 20:30
 * @description:
 */
public class Data {
    private List<Double> listA;
    private List<Double> listB;
    private List<Double> listC;
    private List<Double> listD;

    public Data(List<Double> listA, List<Double> listB, List<Double> listC, List<Double> listD) {
        this.listA = listA;
        this.listB = listB;
        this.listC = listC;
        this.listD = listD;
    }

    public Data() {
        this.listA=new ArrayList<>();
        this.listB=new ArrayList<>();
        this.listC=new ArrayList<>();
        this.listD=new ArrayList<>();
    }

    public List<Double> getListA() {
        return listA;
    }

    public void setListA(List<Double> listA) {
        this.listA = listA;
    }

    public List<Double> getListB() {
        return listB;
    }

    public void setListB(List<Double> listB) {
        this.listB = listB;
    }

    public List<Double> getListC() {
        return listC;
    }

    public void setListC(List<Double> listC) {
        this.listC = listC;
    }

    public List<Double> getListD() {
        return listD;
    }

    public void setListD(List<Double> listD) {
        this.listD = listD;
    }

    @Override
    public String toString() {
        return "Data{" +
                "listA=" + listA +
                ", listB=" + listB +
                ", listC=" + listC +
                ", listD=" + listD +
                '}';
    }
}
