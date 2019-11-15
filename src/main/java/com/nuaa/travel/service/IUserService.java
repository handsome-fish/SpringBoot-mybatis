package com.nuaa.travel.service;

import com.nuaa.travel.dto.UserDTO;

public interface IUserService {
    Integer login(UserDTO userDTO);

    Integer register(UserDTO userDTO);
}
