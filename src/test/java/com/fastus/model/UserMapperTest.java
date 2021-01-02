package com.fastus.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    @Test
    void testUserCommandMapper() {
        User user = new User("Tom", "Kar", "ssdfsd");

        UserCommand userCommand = UserMapper.INSTANCE.userCommand(user);

        assertNotNull(userCommand);
        assertEquals("Tom",userCommand.getFirstName());
    }


    @Test
    void testUserMapper() {
        UserCommand userCommand = new UserCommand("Tom", "Kar", "ssdfsd");

        User user = UserMapper.INSTANCE.user(userCommand);

        assertNotNull(user);
        assertEquals("Tom",user.getFirstName());
    }
}