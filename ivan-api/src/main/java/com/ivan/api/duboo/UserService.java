package com.ivan.api.duboo;

import com.ivan.entity.User;

import java.util.List;

/**
 * 描述：
 *
 * @auth mrz
 * @mail 617071233@qq.com
 * @create 2017/7/29 10:31
 */
public interface UserService {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //自定义
    List<User> getUsers();
}
