package com.fastus.model;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "firstName",target = "firstName")
    UserCommand userCommand(User user);

    @Mapping(source = "firstName",target = "firstName")
    User user(UserCommand userCommand);
}
