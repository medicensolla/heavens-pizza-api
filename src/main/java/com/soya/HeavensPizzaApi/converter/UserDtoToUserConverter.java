package com.soya.HeavensPizzaApi.converter;

import com.soya.HeavensPizzaApi.domain.User;
import com.soya.HeavensPizzaApi.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;

public class UserDtoToUserConverter implements Converter<UserDto, User>  {

    @Override
    public User convert(UserDto userDto) {
        User user = new User();

        BeanUtils.copyProperties(userDto, user);

        return user;
    }
}
