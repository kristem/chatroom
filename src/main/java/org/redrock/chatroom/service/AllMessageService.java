package org.redrock.chatroom.service;

import org.redrock.chatroom.PoJo.AllMessage;
import org.redrock.chatroom.dao.AllMessageMapper;
import org.redrock.chatroom.exception.ServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllMessageService {

    @Autowired
    AllMessageMapper allMessageMapper;

    public void addmessage(AllMessage allMessage) {
        boolean result = allMessageMapper.insertAllMessage(allMessage);
        if(!result) {
            throw new ServerException();
        }
    }
}
