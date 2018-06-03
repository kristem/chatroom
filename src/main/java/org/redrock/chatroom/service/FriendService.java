package org.redrock.chatroom.service;

import org.redrock.chatroom.dao.UserFriendMapper;
import org.redrock.chatroom.vo.ChatUser;
import org.redrock.chatroom.PoJo.User;
import org.redrock.chatroom.exception.ParameterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.redrock.chatroom.constant.ExceptionMessage.CAN_NOT_ADD_SELF;
import static org.redrock.chatroom.constant.ExceptionMessage.SUCCESS;
import static org.redrock.chatroom.constant.ExceptionMessage.USER_NOT_EXIST;

@Service
public class FriendService {

    @Autowired
    private UserService userService;

    @Autowired
    private UserFriendMapper userFriendMapper;

    public String addFriend(String username, String friendName) {
        User friend = userService.getUserByUserName(friendName);
        User user = userService.getUserByUserName(username);
        if (friend == null) {
            throw new ParameterException(USER_NOT_EXIST);
        }
        if(username.equals(friendName)) {
            throw new ParameterException(CAN_NOT_ADD_SELF);
        }
        int userId = user.getUserId();
        int friendId = friend.getUserId();
        userFriendMapper.insertFriends(userId, friendId);
        userFriendMapper.insertFriends(friendId, userId);
        return SUCCESS;
    }

    public List<ChatUser> getFriendsByUsername (String username) {
        User user = userService.getUserByUserName(username);
        List<Integer> FriendList = userFriendMapper.getFriendListByUserId(user.getUserId());
        List<ChatUser> friends = new ArrayList<>();
        for(Integer friendId:FriendList){
            ChatUser chatUser = new ChatUser();
            User user1 = userService.getUserByUserId(friendId);
            chatUser.setNickName(user1.getNickname());
            chatUser.setUserName(user1.getUsername());
            friends.add(chatUser);
        }
        return friends;
    }
}
