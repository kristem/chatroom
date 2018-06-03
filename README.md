# 期末考核



## 题目要求



##### level1

​	使用图灵机器人的WEBAPI，写一个网页版聊天机器人，前端自己想办法，自己不会的话网上找一份代码
​	抄也可以。
​	要求：
​	能和图灵机器人聊天。
​	后端转发，不要直接用图灵机器人给的网站解决方案。大概就是要在他的api上做一层封装。
​	前后端之间通讯方式不限。
​	加分项：
​	websocket
​	level1为基础要求，全部学员最低要求完成level1。

##### level2

​	自己实现一个聊天室，要求能够实现一对一聊天。
​	要求：
​	实现一对一聊天功能。
​	实现加好友功能。
​	通信方式不限。
​	加分项：
​	websocket
​	历史聊天记录保存。
​	实现emoji表情的发送

##### level3

​	将level2里面的聊天室，接入微信网页开发，使用自己的测试号，实现聊天室内好友能直接使用openid
​	加好友。
​	要求：
​	聊天要求同level2
​	用户在聊天时使用的是微信昵称和头像
​	加分项：
​	加分项同level2

##### 附加题

​	上面的level1 2 3都基于网页开发，如果觉得自己对微信足够熟悉，允许使用微信公众号来写以上的题
​	目，即在自己的公众号里面通过公众号的消息回复，实现图灵机器人聊天功能，端对端聊天功能等，功
​	能实现要求同上。具体做的方式不作要求。
​	选择附加题直接视为至少要写到level2。
​	选择附加题的同学可以不实现网页。直接提交公众号即可。
​	图灵机器人有公众号自动回复的功能，但还是要求后端自己实现转发，不要取巧。
​	

## 实现

1.level1

- 调用图灵api
- 实现前端页面
- 实现自动回复功能

2.level2

1. **实现**

   后端：

   - 账号登陆注册
   - 基本通讯后端接口
   - 加好友后端接口
   - 发送emoji表情😈

   前端：

   - 完成了登陆注册html和JavaScrip
   - 完成了聊天室窗口的页面
   - 完成了一对一聊天的JavaScrip

2. **未实现**

   前后端未能交互

3.level3

- 实现微信接入
- 实现获取微信用户信息

## 技术栈

springboot

mybatis

jQuery

#### 通信方式

websocket

http

## 心得

由于寒假没有写弹幕，所以这次考核一开始先去学习了websocket。并且由于之前只是接触过html和少量js，所以还去学习了jQuery以及ajax。但是前端还是有点小问题所以不能交互。所以没有部署到服务器上。
这次考核虽然写的不够好，但是通过这次考核我学到了新的知识，所以还是很开心。😊























