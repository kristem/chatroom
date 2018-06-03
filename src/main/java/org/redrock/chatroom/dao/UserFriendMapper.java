package org.redrock.chatroom.dao;

import java.util.List;

public interface UserFriendMapper {
    boolean insertFriends(int userId, int friendId);
    List<Integer> getFriendListByUserId(int userId);

}

