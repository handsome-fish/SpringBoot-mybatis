package com.nuaa.travel.controller;

import com.nuaa.travel.dto.UserDTO;
import com.nuaa.travel.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//跨域问题解决注解
@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 登录，验证用户名和密码是否配对并且往前端返回该用户的权限
     * @param userDTO
     * @return
     */
    @PostMapping(value = "/login")
    public Integer login(@RequestBody UserDTO userDTO){
        return userService.login(userDTO);
    }

    /**
     * 注册，增加新用户
     * @param userDTO
     * @return
     */
    @PostMapping(value = "/register")
    public Integer register(@RequestBody UserDTO userDTO){
        return userService.register(userDTO);
    }



}
