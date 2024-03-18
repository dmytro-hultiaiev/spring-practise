package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();

        try(SessionFactory factory = configuration.buildSessionFactory()){
            try(Session session = factory.openSession()){
                Employee employee = Employee.builder()
                        .name("Dmytro")
                        .surname("Hultiaiev")
                        .department("Java DEV")
                        .salary(1000)
                        .build();

                session.beginTransaction();
                session.persist(employee);
                session.getTransaction().commit();
            }
            try(Session session = factory.openSession()){
                session.beginTransaction();

                Employee employee = session.get(Employee.class, 1);
                System.out.println(employee);

                session.getTransaction().commit();
            }
            try(Session session = factory.openSession()){
                session.beginTransaction();

                Employee employee = session.get(Employee.class, 2);
                employee.setName("Taras");
                employee.setSurname("Tkach");
                employee.setSalary(900);

                session.getTransaction().commit();
            }
        }
    }
}
