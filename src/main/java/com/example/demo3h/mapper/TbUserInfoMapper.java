package com.example.demo3h.mapper;

import com.example.demo3h.model.TbUserInfo;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface TbUserInfoMapper {
    @Select("SELECT * FROM tb_userinfo")
    List<TbUserInfo> findAll();

    @Delete("DELETE FROM tb_userinfo WHERE userid=#{id}")
    int del(int id);

    @Insert("INSERT INTO tb_userinfo VALUES(NULL,#{userAccount},#{password},#{email},0,NOW(),0,#{image})")
    int add(TbUserInfo userInfo);

    @Update("UPDATE tb_userinfo SET userAccount=#{userAccount},password=#{password},email=#{email},image=#{image} WHERE userid=#{userid}")
    int update(TbUserInfo userInfo);

    @Select("SELECT * FROM tb_userinfo WHERE userid=#{id}")
    TbUserInfo findById(int id);
}
