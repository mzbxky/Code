package com.fc;

import com.fc.config.TestConfig;
import com.fc.entity.Car;
import com.fc.entity.Person;
import com.fc.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        TestConfig testConfig = applicationContext.getBean(TestConfig.class);

        //获取的是代理对象
        System.out.println(testConfig);
        User user1 = testConfig.getUser();
        User user2 = testConfig.getUser();
        //每次都new了一个对象
        System.out.println(user1);
        System.out.println(user2);
        //从容器中获取，单例模式
        User user3 = applicationContext.getBean(User.class);
        User user4 = applicationContext.getBean(User.class);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println("-------------------------------");
        Person person = applicationContext.getBean(Person.class);
        Car car = applicationContext.getBean(Car.class);
        Car newCar = testConfig.getCar();
        person.setCar(newCar);
        //如果有代理对象，值就是一样的
        System.out.println(person.getCar() == car);

    }

}
