package com.murtazin.pp314;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Wait...." );

        ConfigurableApplicationContext context =SpringApplication.run(App.class, args);
        Communication communication = context.getBean("communication", Communication.class);
        System.out.println(communication.getAllUsers());
        System.out.println("Answer: " + communication.getAnswer());
    }
}
