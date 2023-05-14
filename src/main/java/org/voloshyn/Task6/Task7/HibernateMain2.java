package org.voloshyn.Task6.Task7;

import org.hibernate.Session;
import org.voloshyn.Task6.HibernateUtil;
import org.voloshyn.Task6.entity.Device;
import org.voloshyn.Task6.entity.Person;
import org.voloshyn.Task6.entity.Phone;
import org.voloshyn.Task6.entity.SocialMedia;

import java.util.Arrays;
import java.util.HashSet;

public class HibernateMain2 {
    //Implement OneToOne, OneToMany, ManyToMany relations in your models from previous task. (add some additional tables if you need)
    //Test it by CRUD.
    public static void main(String[] args) {
        Person person = new Person("David", 21);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        //one to pone
        person.setPhone(new Phone("380970561897"));
        Long id = (Long) session.save(person); //deprecated, ignore;
        System.out.println("one to one " + session.get(Person.class, id));
        //one to many
        person.setDevices(new HashSet<>(Arrays.asList(new Device("Iphone11"), new Device("DellXPS"))));
        session.saveOrUpdate(person);//deprecated, ignore;
        person.getDevices().forEach(session::save); //deprecated, ignore;
        System.out.println("one to many " + session.get(Person.class, id));
        //many to Many
        Person newPerson = new Person();
        SocialMedia discord = new SocialMedia("discord");
        SocialMedia instagram = new SocialMedia("instagram");
        Long id1 = (Long) session.save(newPerson); //deprecated, ignore;
        session.save(instagram); //deprecated, ignore;
        session.save(discord); //deprecated, ignore;
        person.setSocialMedia(Arrays.asList(discord, instagram)); //deprecated, ignore;
        newPerson.setSocialMedia(Arrays.asList(discord, instagram));
        session.saveOrUpdate(instagram); //deprecated, ignore;
        session.saveOrUpdate(discord); //deprecated, ignore;
        System.out.println("many to many " + session.get(Person.class, id));
        System.out.println("many to many " + session.get(Person.class, id1));
        session.getTransaction().commit();
        session.close();
        System.exit(0);
    }
}
