package org.voloshyn.Task5;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/*
{
  "name": "Emily",
  "age": 22,
  "friends": ["Alice", "Bob", "David"]
}
*/
public class Person implements Serializable, Comparable { //ignore
    public Person() {
    }

    @JsonProperty
    private String name;
    @JsonProperty
    private Integer age;
    @JsonProperty
    private List<String> friends;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", friends=" + friends +
                '}';
    }

    @Override
    public int compareTo(Object x) {
        Person o1 = this;
        Person o2 = (Person) x;
        return o1.getName().compareTo(o2.getName());
    }
}
