package com.soya.HeavensPizzaApi.converter;

import com.soya.HeavensPizzaApi.domain.User;
import com.soya.HeavensPizzaApi.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;

public class UserToUserDtoConverter implements Converter<User, UserDto> {

    @Override
    public UserDto convert(User user) {

        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(user, userDto);

        return userDto;
    }
}
