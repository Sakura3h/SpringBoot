package com.example.demo3h.service;


import com.example.demo3h.model.TbUserInfo;

import java.util.List;

public interface TbUserInfoService {

    List<TbUserInfo> findAll();

    int del(int id);

    }
