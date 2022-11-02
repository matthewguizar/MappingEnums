package client;

import org.hibernate.Session;

import entity.Employee;
import entity.EmployeeStatus;
import util.HibernateUtil;

public class EnumClient {

    public static void main(String[] args) {
        Session session = HibernateUtil.SessionFactory().openSession();
        session.beginTransaction();
        

       
        Employee e1 = new Employee("Josh Stockham", "2014JA11001", EmployeeStatus.FULL_TIME);
        Employee e2 = new Employee("Ammie Corrio", "2014AI21543", EmployeeStatus.PART_TIME);
        Employee e3 = new Employee("Ernie Stenseth", "2014ET25100", EmployeeStatus.CONTRACT);

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);

        session.getTransaction().commit();
        session.close();
        System.exit(0);
        
    
    }
}
