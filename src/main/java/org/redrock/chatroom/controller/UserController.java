package org.redrock.chatroom.controller;

import org.redrock.chatroom.PoJo.User;
import org.redrock.chatroom.constant.ReturnCode;
import org.redrock.chatroom.dto.ResponseEntity;
import org.redrock.chatroom.service.FriendService;
import org.redrock.chatroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.redrock.chatroom.constant.ExceptionMessage.SUCCESS;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private FriendService friendService;

    @PostMapping("register")
    public ResponseEntity<User> register(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, SUCCESS, user);
    }

    @PostMapping("test")
    public void test() {
        System.out.println("test");
    }

    @PostMapping("login")
    public ResponseEntity<User> login(@RequestBody User user) {
        User userGet = userService.checkUser(user);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, SUCCESS, userGet);
    }

    @GetMapping("{userId}")
    public ResponseEntity<User> showUserInfoByUserId(@PathVariable int userId) {
        User user = userService.getUserByUserId(userId);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, SUCCESS, user);
    }

    @GetMapping("{userName}")
    public ResponseEntity<User> showUserInfoByUserName(@PathVariable String userName) {
        User user = userService.getUserByUserName(userName);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, SUCCESS, user);
    }

    @PostMapping("addFriend")
    public ResponseEntity<Object> addfriends(@RequestParam String userName, @RequestParam String friendName ){
        friendService.addFriend(userName,friendName);
        return  new ResponseEntity<>(ReturnCode.SUCCESS_CODE,SUCCESS,null);
    }
}
