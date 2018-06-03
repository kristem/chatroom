package org.redrock.chatroom.PoJo;

import lombok.Data;

@Data
public class AllMessage {
    private int allMessageId;
    private String sender;
    private String content;
    private String allType;
    private String sendTime;
}
