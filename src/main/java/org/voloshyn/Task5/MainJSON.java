package org.voloshyn.Task5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/*
a) Make some complex models using your variant.
b) Make it serializable.
c) Read json from “input.json”
d) and deserialize it to POJO.
e) Then change a few fields and save it to “output.json”.
f) Do the same for xml.
*/
public class MainJSON {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File inputFile = new File("C:/Users/flqxd/OneDrive/Робочий стіл/JAVA/javaAutomationTesting/javaAutomationTesting/src/main/java/org/voloshyn/Task5/input.json");
        Person person = objectMapper.readValue(inputFile, Person.class);
        person.setName("Sasha");
        person.setAge(20);
        person.setFriends(Arrays.asList("Max", "Liza", "David", "Alex", "Andrew"));
        File outputFile = new File("C:/Users/flqxd/OneDrive/Робочий стіл/JAVA/javaAutomationTesting/javaAutomationTesting/src/main/java/org/voloshyn/Task5/output.json");
        objectMapper.writeValue(outputFile, person);
        System.out.println("Output saved in file - output.json");
    }
}
