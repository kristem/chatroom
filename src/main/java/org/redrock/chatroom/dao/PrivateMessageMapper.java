package org.redrock.chatroom.dao;

import org.redrock.chatroom.PoJo.PrivateMessage;

public interface PrivateMessageMapper {
    boolean insertPrivateMessage(PrivateMessage privateMessage);
}
