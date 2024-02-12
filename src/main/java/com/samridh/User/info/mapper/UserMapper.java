package com.samridh.User.info.mapper;


import com.samridh.User.info.dto.UserDTO;
import com.samridh.User.info.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO mapUserToUserDto(User user);

    User mapUserDtoToUser(UserDTO userDTO);
}
