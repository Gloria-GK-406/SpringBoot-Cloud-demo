package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public User queryById(Long id)
    {
        return mapper.selectByPrimaryKey(id);
    }


}
