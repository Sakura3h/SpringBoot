package com.example.demo3h.service;

import com.example.demo3h.mapper.TbUserInfoMapper;
import com.example.demo3h.model.TbUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserInfoService {

    @Autowired
    TbUserInfoMapper tbUserInfoMapper;

    public List<TbUserInfo> find(){
        return  tbUserInfoMapper.findAll();
    }

}
