package com.in28minutes.learnspringframework.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
this record ds is sort form of
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.age=age;
        this.name = name;
    }
    public String name(){
        return this.name;
    }
    public int age(){
        return this.age;
    }
}
*/
record Person(String name,int age){ };

record Address(String city,String street){ };
@Configuration
public class HelloWorldConfiguration {
    // can define methods to create the spring beans in configuration class
    @Bean
    public String name(){
        return "Ranga";
    }

    @Bean
    public int age(){
        return 12;
    }

    @Bean
    public Person person(){
        var person = new Person("Ravi",20);
        System.out.println("inside bean "+person.age());
        System.out.println("inside bean "+person.name());
        return person;
    }

    @Bean
    public Address address(){
        return new Address("dehradun","jhajra");
    }

}

