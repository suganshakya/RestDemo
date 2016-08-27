package np.shakya.sugan.etl.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by sugan on 27/08/16.
 */
@Component
public class CustomerDao {

    @PersistenceContext
    private EntityManager em;

    // Create
    @Transactional
    public void persist(Customer customer){
        em.persist(customer);
    }

    // Read
    public Customer getCustomer(long id){
        Customer customer=null;
        // TODO
        // Read customer from database
        return customer;
    }

    public List<Customer> getAllCustomer(){
        List<Customer> customerList=null;
        // TODO
        // Read all customer from database
        return customerList;
    }

    // Update
    public void update(Customer customer){
        // TODO
    }

    // Delete
    @Transactional
    public void remove(long customerId){
        // TODO
    }

    @Transactional
    public void remove(Customer customer){
        em.remove(customer);
    }


}
