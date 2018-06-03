package org.redrock.chatroom.controller;

import com.google.gson.Gson;
import org.redrock.chatroom.PoJo.PrivateMessage;
import org.redrock.chatroom.PoJo.AllMessage;
import org.redrock.chatroom.PoJo.User;
import org.redrock.chatroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {
    public static final String TOALL = "to_all";
    public static final String TOPERSON = "to_person";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Gson gson = new Gson();

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private UserService userService;

    @MessageMapping("/all")
    @SendTo("/topic/all")
    public String all(User user, String message) {
        AllMessage allMessage = new AllMessage();
        allMessage.setAllType(TOALL);
        allMessage.setContent(message);
        allMessage.setSender(user.getUsername());
        allMessage.setSendTime(simpleDateFormat.format(new Date()));
        return gson.toJson(allMessage);
    }

    @MessageMapping("/chat")
    public void chat (User user, String message) {
        PrivateMessage privateMessage = gson.fromJson(message,PrivateMessage.class);
        AllMessage allMessage = new AllMessage();
        allMessage.setSender(user.getUsername());
        allMessage.setAllType(TOPERSON);
        allMessage.setContent(privateMessage.getContent());
        allMessage.setSender(user.getUsername());
        allMessage.setSendTime(simpleDateFormat.format(new Date()));
        messagingTemplate.convertAndSendToUser(privateMessage.getReceiverName(),"/topic/chat",gson.toJson(allMessage));
    }

}
