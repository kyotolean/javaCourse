package org.voloshyn.Task6;

import org.hibernate.Session;
import org.voloshyn.Task6.entity.Person;

import static org.voloshyn.Task6.HibernateUtil.getSessionFactory;

public class HibernateMain {
    public static void main(String[] args) {
        Person person = new Person("David", 20);
        Session session = getSessionFactory().getCurrentSession();

        session.beginTransaction();
        //Create
        Long id = (Long) session.save(person); //deprecated, ignore warning
        //Read
        Person personRead = session.get(Person.class, id);
        //Update
        Person personUpdate = personRead;
        personUpdate.setName("David");
        session.saveOrUpdate(personUpdate); //deprecated, ignore warning
        //Delete
        session.delete(person);  //deprecated, ignore warning
        session.getTransaction().commit();
        session.close();
        System.exit(0);
    }
}
