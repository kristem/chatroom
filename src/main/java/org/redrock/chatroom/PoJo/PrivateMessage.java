package org.redrock.chatroom.PoJo;

import lombok.Data;

@Data
public class PrivateMessage {
    private int privateMessageId;
    private String receiverName;
    private String content;
    private String type;
}
