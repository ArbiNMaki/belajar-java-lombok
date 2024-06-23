package com.belajar.java.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    void testCreateViaConstructor() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Gaming");
        hobbies.add("Coding");
        hobbies.add("Traveling");

        var person = new Person("id", "name", 30, hobbies);
    }

    @Test
    void testCreateViaSetter() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Gaming");
        hobbies.add("Coding");
        hobbies.add("Traveling");

        var person = new Person();
        person.setId("id");
        person.setName("name");
        person.setAge(30);
        person.setHobbies(hobbies);
    }

    @Test
    void testCreateViaBuilder() {
        var person = Person.builder()
                .id("id")
                .name("name")
                .age(30)
                .hobby("Gaming")
                .hobby("Coding")
                .hobby("Traveling")
                .build();

        System.out.println(person);
    }
}
