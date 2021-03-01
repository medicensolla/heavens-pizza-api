package com.soya.HeavensPizzaApi.controller;

import com.soya.HeavensPizzaApi.dto.UserDto;
import com.soya.HeavensPizzaApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    private final UserService userService;

    @Autowired
    public ContactController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create-user")
    public ResponseEntity<UserDto> createActor(@RequestBody UserDto userDto) {

        UserDto userResponseDto = this.userService.createUser(userDto);

        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);

    }
}
