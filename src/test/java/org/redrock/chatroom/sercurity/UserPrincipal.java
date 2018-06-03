//package org.redrock.chatroom.sercurity;
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//
//public class UserPrincipal extends User {
//    private static final long serialVersionUID = 1L;
//    private String nickname;
//
//    public UserPrincipal(String username, String password, Collection<? extends GrantedAuthority> authorities) {
//        super(username, password, authorities);
//    }
//
//    public UserPrincipal(String username, String password, boolean enabled, boolean accountNonExpired,
//                         boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
//        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
//    }
//
//
//    public String getNickname() {
//        return nickname;
//    }
//
//    @Override
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }
//}
