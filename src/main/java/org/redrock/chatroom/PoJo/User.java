package org.redrock.chatroom.PoJo;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String username;
    private String password;
    private String nickname;

    public User(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }

}
