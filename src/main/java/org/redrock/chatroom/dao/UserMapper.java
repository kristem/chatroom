package org.redrock.chatroom.dao;

import org.redrock.chatroom.PoJo.User;

public interface UserMapper {

    boolean insertUser(User user);

    User findUserByUserId(int userId);

    User findUserByUserName(String username);
}
