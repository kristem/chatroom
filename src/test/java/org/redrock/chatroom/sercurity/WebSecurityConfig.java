//package org.redrock.chatroom.sercurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
////@Configuration
////@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private ChatUserDetailsService  chatUserDetailsService;
//
//    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
////        authenticationManagerBuilder.userDetailsService(this.chatUserDetailsService);
//    }
//
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
////        httpSecurity.authorizeRequests().antMatchers("/","/register").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").defaultSuccessUrl("/chat", true)
////                .permitAll().and().logout().permitAll().and().csrf().disable();
//  httpSecurity.csrf().disable();
//    }
//}
