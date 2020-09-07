package com.wang.mapper;

import com.wang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    //原来(只用Mybatis); 我们的所有操作都使用sqlSession来执行
    //现在(Spring整合Mybatis): 我们使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    //为了在Spring中注入, 这里要写一个Setter
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> queryUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.queryUser();
    }
}
