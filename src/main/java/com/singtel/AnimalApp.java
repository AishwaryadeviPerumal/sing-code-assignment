package com.singtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalApp
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Animals App!" );
        SpringApplication.run(AnimalApp.class,args);
    }
}
