package org.redrock.chatroom.PoJo;

import lombok.Data;

@Data
public class UserFriend {
    private int userId;
    private int friendId;
    private int delFlag;
}
