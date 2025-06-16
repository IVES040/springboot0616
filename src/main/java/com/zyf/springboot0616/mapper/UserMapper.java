package com.zyf.springboot0616.mapper;

import com.zyf.springboot0616.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Humble040
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-06-16 16:56:23
* @Entity com.zyf.springboot0616.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




