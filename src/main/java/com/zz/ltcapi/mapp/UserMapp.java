package com.zz.ltcapi.mapp;

import com.zz.ltcapi.entity.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * 操作用户
 */
public interface UserMapp {
    /**
     * 检测用户是否注册
     * @param mobile
     * @return
     */
    @Select("select * from t_user where mobile = #{mobile}")
    TUser checkUser(String mobile);
}
