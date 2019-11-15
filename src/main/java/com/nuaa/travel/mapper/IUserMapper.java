package com.nuaa.travel.mapper;

import com.nuaa.travel.dto.UserDTO;
import com.nuaa.travel.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface IUserMapper {
    Integer selectCount(String userName);

    UserDTO selectUser(String userName);

    Integer addOneUser(UserDO userDO);
}
