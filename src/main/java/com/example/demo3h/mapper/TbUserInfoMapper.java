package com.example.demo3h.mapper;

import com.example.demo3h.model.TbUserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TbUserInfoMapper {
    @Select("SELECT * FROM tb_userinfo")
    List<TbUserInfo> findAll();

    @Delete("DELETE FROM tb_userinfo WHERE userid=#{id}")
    int del(int id);
}
