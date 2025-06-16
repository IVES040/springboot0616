package com.zyf.springboot0616.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyf.springboot0616.entity.User;
import com.zyf.springboot0616.service.UserService;
import com.zyf.springboot0616.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Humble040
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-06-16 16:56:23
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




