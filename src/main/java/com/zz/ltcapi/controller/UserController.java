package com.zz.ltcapi.controller;

import com.zz.ltcapi.entity.ResultEntity;
import com.zz.ltcapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
@RequestMapping("ltcapi/userinfo")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;
    /**
     * 用户注册
     * @param map
     * @return
     */
    @RequestMapping(value = "/requester",method = RequestMethod.POST)
    public ResultEntity register(@RequestParam Map<String,Object> map){
        ResultEntity register = userService.register(map);
        return register;
    }
}
