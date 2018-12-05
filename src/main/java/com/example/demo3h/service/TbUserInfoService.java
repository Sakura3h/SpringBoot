package com.example.demo3h.service;



import com.example.demo3h.model.TbUserInfo;

import java.util.List;

public interface TbUserInfoService {

    List<TbUserInfo> findAll();

    List<TbUserInfo> find();

    int del(int id);

    int add(TbUserInfo userInfo);

    int  upadate(int id,TbUserInfo userInfo);

   TbUserInfo findById(int id);

    }
