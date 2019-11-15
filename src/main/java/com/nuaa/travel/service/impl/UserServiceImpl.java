package com.nuaa.travel.service.impl;

import com.nuaa.travel.dto.UserDTO;
import com.nuaa.travel.entity.UserDO;
import com.nuaa.travel.mapper.IUserMapper;
import com.nuaa.travel.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    /**
     * 登录功能，验证用户名和密码是否匹配，匹配则返回用户的权限编号，不匹配则返回0（代表该用户不存在），-1（代表用户名和密码不匹配）
     * @param userDTO
     * @return
     */
    @Override
    public Integer login(UserDTO userDTO) {
        if(userMapper.selectCount(userDTO.getName()) == 0){
            return 0;
        }
        else {
            UserDTO trueUser = userMapper.selectUser(userDTO.getName());
            if(trueUser.getPassword().equals(userDTO.getPassword())){
                return 1;
            }
            else {
                return -1;
            }
        }
    }

    /**
     * 注册功能，往数据库里面添加一条数据
     * @param userDTO
     * @return
     */
    @Override
    public Integer register(UserDTO userDTO) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userDTO,userDO);
        return userMapper.addOneUser(userDO);
    }
}
