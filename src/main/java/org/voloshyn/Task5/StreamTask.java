package org.voloshyn.Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
    public static void main(String[] args) {
        //Generate 10 random object using class from previous class
        List<Person> personList = generatePersonList(10); //ignore warning
        System.out.println(personList);
        //Sort it using any two fields using stream
        System.out.println(personList.stream().sorted().collect(Collectors.toList()));
        //Filter it by any two fields custom filter
        System.out.println(personList.stream().sorted((o1, o2) -> o1.getAge().compareTo(o2.getAge()) * o1.getName().compareTo(o2.getName())).collect(Collectors.toList()));
        System.out.println(personList.stream().filter(u -> u.getAge() > 1).collect(Collectors.toList()));
        //Collect it to List with *main field(s).
        System.out.println('\n');
        System.out.println(personList.stream().map(Person::getName).collect(Collectors.toList()));
        System.out.println(personList.stream().map(Person::getAge).collect(Collectors.toList()));
    }

    private static List<Person> generatePersonList(int j) //ignore waning
    {
        Random random = new Random();
        List<Person> personList = new ArrayList<>();
        IntStream.range(1, j).forEach(i -> {
            Person person = new Person();
            person.setName("User num. " + random.nextInt(60));
            person.setAge(random.nextInt(60));
            // TODO: set random list for friends | Currrent = bool.
            person.setFriends(Collections.singletonList(Boolean.toString(random.nextBoolean())));
            personList.add(person);
        });
        return personList;
    }
}
/*
{
  "name": "Emily",
  "age": 22,
  "friends": ["Alice", "Bob", "David"]
}

* */
