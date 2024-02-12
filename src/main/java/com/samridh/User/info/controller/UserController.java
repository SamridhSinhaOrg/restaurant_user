package com.samridh.User.info.controller;

import com.samridh.User.info.dto.UserDTO;
import com.samridh.User.info.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
        UserDTO savedUser = userService.addUser(userDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @GetMapping("/fetchUserById/{id}")
    public ResponseEntity<UserDTO> getAllRestaurants(@PathVariable Integer id) {
        UserDTO userDTO = userService.fetchUserBYId(id);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }


}
