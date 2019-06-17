package com.itheima.dao;

import com.itheima.domain.Items;

//dao层接口
public interface ItemsDao {
    //根据id查询数据
    Items findById(Integer id);
}
