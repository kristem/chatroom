package org.redrock.chatroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.redrock.chatroom.dao")
public class ChatroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatroomApplication.class, args);
	}
}
