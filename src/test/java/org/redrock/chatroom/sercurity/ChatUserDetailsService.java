//package org.redrock.chatroom.sercurity;
//
//import org.redrock.chatroom.PoJo.User;
//import org.redrock.chatroom.exception.ParameterException;
//import org.redrock.chatroom.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.redrock.chatroom.constant.ExceptionMessage.USER_NOT_EXIST;
//
//@Service
//public class ChatUserDetailsService implements UserDetailsService {
//    private final static String ROLE = "user";
//
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//        User user = userService.getUserByUserName(username);
//        if(user == null) {
//            throw new ParameterException(USER_NOT_EXIST);
//        }
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority(ROLE));
//        UserPrincipal userPrincipal = new UserPrincipal(username, user.getPassword(), authorities);
//        userPrincipal.setNickname(user.getNickname());
//        return userPrincipal;
//    }
//}
