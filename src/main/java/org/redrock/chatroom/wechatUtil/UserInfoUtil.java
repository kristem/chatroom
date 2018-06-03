package org.redrock.chatroom.wechatUtil;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserInfoUtil {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public static String Get_Code = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=%s&state=STAT#wechat_redirect";
    public static String getCode(String APPID, String REDIRECT_URI,String SCOPE) {
        return String.format(Get_Code,APPID,REDIRECT_URI,SCOPE);
    }

    public static String Web_access_tokenhttps = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";
    public static String getWebAccess(String APPID, String SECRET,String CODE) {
        return String.format(Web_access_tokenhttps, APPID, SECRET,CODE);
    }

    public static String User_Message = "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s&lang=zh_CN";
    public static String getUserMessage(String access_token, String openid) {
        return String.format(User_Message, access_token,openid);
    }
}
