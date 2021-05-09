package com.cgqcl.controller;

import com.cgqcl.entity.Data;
import com.cgqcl.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * @author: cm
 * @date: Created in 2021/5/7 20:27
 * @description:
 */
@RestController
@CrossOrigin
public class DataController {
    //添加日志对象
    private static final Logger log = LoggerFactory.getLogger(DataController.class);

    @Autowired
    private DataService dataService;
    //查询数据的接口
    @PostMapping("/getData")
    public Data getData(@RequestBody(required = false) Data data){
        log.info("接收的传感器数据: {}",data);
        //判断存在id更新操作  不存在id添加操作
        //if (data==null) {  //如果为空
            log.info("初次获取数据.....");
            System.out.println(dataService.fistGet());
            return dataService.fistGet();
        /*}else{
            log.info("二次获取数据.....");

            return dataService.getData(data);
        }*/
    }
    //查询数据的接口
    @GetMapping("/getData")
    public Data getData2(@RequestBody(required = false) Data data){
        log.info("接收的传感器数据: {}",data);
        //判断存在id更新操作  不存在id添加操作
        if (data==null) {  //如果为空
            log.info("初次获取数据.....");
            System.out.println(dataService.fistGet());
            return dataService.fistGet();
        }else{
            log.info("二次获取数据.....");

            return dataService.getData(data);
        }
    }
    @GetMapping("getData2")
    public String sayHello(  String a){
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        return "a";
    }
}
