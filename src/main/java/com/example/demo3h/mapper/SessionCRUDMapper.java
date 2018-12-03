package com.example.demo3h.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface SessionCRUDMapper {
    @Insert("insert into sessions (jsessionid,session) value(#{jsessionId},#{sessionString})")
    int  doCreate(@Param("jsessionId") String jsessionId,@Param("sessionString") String sessionString);

    @Select("select session from sessions where jsessionid=#{jsessionId} ")
    String doReandSession(@Param("jsessionId") String jsessionId);

    @Update("Update sessions set session=#{sessionString} where jsessionid=#{jsessionId}")
    int doUpdate(@Param("sessionString") String sessionString, @Param("jsessionId") String jsessionId);

    @Delete("delete  from sessions where jsessionid=#{jsessionId}")
    int doDelete(@Param("jsessionId") String jsessionId);




}
