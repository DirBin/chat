package com.ivan.duboo.dao;

import com.ivan.entity.User;

import java.util.List;

/**
 * 描述：
 *
 * @auth mrz
 * @mail 617071233@qq.com
 * @create 2017/7/29 16:28
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();
}
