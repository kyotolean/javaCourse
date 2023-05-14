package org.voloshyn.Task5;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

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
public class ParseXML {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Person person = xmlMapper.readValue(new File("C:/Users/flqxd/OneDrive/Робочий стіл/JAVA/javaAutomationTesting/javaAutomationTesting/src/main/java/org/voloshyn/Task5/input.xml"), Person.class);
        person.setName("Stepan");
        person.setAge(20);
        person.setFriends(Arrays.asList("Andrew", "Josh", "Kanye", "Bill", "Elon"));
        xmlMapper.writeValue(new File("C:/Users/flqxd/OneDrive/Робочий стіл/JAVA/javaAutomationTesting/javaAutomationTesting/src/main/java/org/voloshyn/Task5/output.xml"), person);
        System.out.println("Output saved in file - output.xml");
    }
}
