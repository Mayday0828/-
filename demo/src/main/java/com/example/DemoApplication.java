package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class DemoApplication {

    public static void main(String[] args) {
System.out.println("Hello");


        public class LoginApplication {

            public static void main(String[] args) {
                SpringApplication.run(LoginApplication.class, args);
            }

            @PostMapping("/login")
            public String login(@RequestBody LoginRequest loginRequest) {
                // 获取用户输入的用户名和密码
                String username = loginRequest.getUsername();
                String password = loginRequest.getPassword();

                // 使用BCryptPasswordEncoder加密密码
                BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
                String encodedPassword = bCryptPasswordEncoder.encode(password);

                // 这里是一个示例数据库查询，实际开发中需要连接到真实的数据库
                // 这里假设我们有一个名为users的表，其中有一个名为password的字段
                // 如果用户输入的用户名和密码与数据库中匹配，则返回一个包含用户名的字符串
                // 否则，返回一个错误消息
                if ("user".equals(username) && "password".equals(encodedPassword)) {
                    return "Hello, " + username;
                } else {
                    return "Invalid username or password";
                }
            }

            @PostMapping("/signup")
            public String signup(@RequestBody SignupRequest signupRequest) {
                // 获取用户输入的用户名和密码
                String username = signupRequest.getUsername();
                String password = signupRequest.getPassword();

                // 使用BCryptPasswordEncoder加密密码
                BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
                String encodedPassword = bCryptPasswordEncoder.encode(password);

                // 这里是一个示例数据库插入操作，实际开发中需要连接到真实的数据库
                // 这里假设我们有一个名为users的表，其中有一个名为password的字段
                // 如果插入操作成功，则返回一个包含用户名的字符串
                // 否则，返回一个错误消息
                if ("user".equals(username) && "password".equals(encodedPassword)) {
                    return "User created successfully";
                } else {
                    return "Invalid username or password";
                }
            }
        }

// 用户登录请求对象
        class LoginRequest {
            private String username;
            private String password;

            // getters and setters
        }

// 用户注册请求对象
        class SignupRequest {
            private String username;
            private String password;

            // getters and setters
        }
        SpringApplication.run(DemoApplication.class, args);
    }

}
