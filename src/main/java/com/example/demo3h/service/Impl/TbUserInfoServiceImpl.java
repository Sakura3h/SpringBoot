package com.example.demo3h.service.Impl;

import com.example.demo3h.mapper.TbUserInfoMapper;
import com.example.demo3h.model.TbUserInfo;
import com.example.demo3h.service.TbUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserInfoServiceImpl implements TbUserInfoService{
    @Autowired
    private  TbUserInfoMapper tbUserInfoMapper;

    @Override
    public List<TbUserInfo> findAll() {
        return tbUserInfoMapper.findAll();
    }

    @Override
    public int del(int id) {
        return tbUserInfoMapper.del(id);
    }
}
