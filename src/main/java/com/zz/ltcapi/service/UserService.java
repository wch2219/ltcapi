package com.zz.ltcapi.service;

import com.zz.ltcapi.entity.ResultEntity;
import com.zz.ltcapi.entity.TUser;
import org.springframework.stereotype.Service;

import java.util.Map;

public interface UserService {

    /**
     * 注册
     * @return
     */
    ResultEntity register(Map<String,Object> map);

}
