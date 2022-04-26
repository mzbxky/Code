package com.fc;

import com.fc.enetiy.GirlFriends;
import com.fc.enetiy.Son;
import com.fc.enetiy.Wife;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //获取Spring容器
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        // 如果容器中有指定的对象就获取
        if (applicationContext.containsBean("son")) {
            Son son = applicationContext.getBean(Son.class);

            System.out.println("有儿子：" + son);
        } else {
            System.out.println("没儿子");
        }

        if (applicationContext.containsBean("wife")) {
            Wife wife = applicationContext.getBean(Wife.class);

            System.out.println("有老婆：" + wife);
        } else {
            System.out.println("没老婆");
        }

        if (applicationContext.containsBean("girlFriends")) {
            GirlFriends girlFriend = applicationContext.getBean(GirlFriends.class);

            System.out.println("有对象：" + girlFriend);
        } else {
            System.out.println("没对象");
        }
    }

}
