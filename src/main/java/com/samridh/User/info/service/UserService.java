package com.samridh.User.info.service;


import com.samridh.User.info.dto.UserDTO;
import com.samridh.User.info.entity.User;
import com.samridh.User.info.exception.UserNotFoundException;
import com.samridh.User.info.mapper.UserMapper;
import com.samridh.User.info.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO addUser(UserDTO userDTO) {
        User savedUser = userRepository.save(UserMapper.INSTANCE.mapUserDtoToUser(userDTO));
        return UserMapper.INSTANCE.mapUserToUserDto(savedUser);
    }

    public UserDTO fetchUserBYId(Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("user not found !!"));
        return UserMapper.INSTANCE.mapUserToUserDto(user);
    }
}
