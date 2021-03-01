package com.soya.HeavensPizzaApi.service;

import com.soya.HeavensPizzaApi.converter.UserDtoToUserConverter;
import com.soya.HeavensPizzaApi.converter.UserToUserDtoConverter;
import com.soya.HeavensPizzaApi.domain.User;
import com.soya.HeavensPizzaApi.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private final UserToUserDtoConverter userToUserDtoConverter;

    private final UserDtoToUserConverter userDtoToUserConverter;

    @Autowired
    public UserServiceImpl(UserToUserDtoConverter userToUserDtoConverter, UserDtoToUserConverter userDtoToUserConverter) {
        this.userToUserDtoConverter = userToUserDtoConverter;
        this.userDtoToUserConverter = userDtoToUserConverter;
    }


    public UserDto createUser(UserDto userDto) {

        UserDto userResponseDto = new UserDto();
        User newUser = this.userDtoToUserConverter.convert(userDto);
        //Here Goes the save in the repository
        //userResponseDto = this.userToUserDtoConverter.convert(response);
        return userResponseDto;
    }
}
