package com.zz.ltcapi.service.serviceimpl;

import com.zz.ltcapi.entity.ResultEntity;
import com.zz.ltcapi.entity.TUser;
import com.zz.ltcapi.mapp.UserMapp;
import com.zz.ltcapi.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.Map;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapp userMapp;

    @Override
    public ResultEntity register(Map<String, Object> map) {
        String mobile = (String) map.get("mobile");
        if (!StringUtils.isAllEmpty(mobile)) {
            TUser tUser = userMapp.checkUser(mobile);;
            if (tUser != null) {//账号不存在
                return new ResultEntity().setResultData(204,"账号已存在","");
            }
        }
        //账号存在 插入用户 到表中
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();

            String key = (String)entry.getKey();
            String value = (String) entry.getValue();
        }
        return new ResultEntity().setResultData(200,"注册成功","");
    }

}
