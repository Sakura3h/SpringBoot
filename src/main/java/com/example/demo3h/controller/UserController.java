package com.example.demo3h.controller;

import com.example.demo3h.model.JsonResult;
import com.example.demo3h.model.TbUserInfo;
import com.example.demo3h.service.TbUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private TbUserInfoService tbUserInfoService;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserList(){
     JsonResult  r = new JsonResult();
     try {
         List<TbUserInfo> userList  = tbUserInfoService.find();
         r.setResult(userList);
         r.setStatus("ok");
     }catch (Exception e){
         r.setResult(e.getClass().getName()+":"+e.getMessage());
          r.setStatus("error");
     }
        return ResponseEntity.ok(r);
    }
}
