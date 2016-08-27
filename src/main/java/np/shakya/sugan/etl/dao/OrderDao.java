package np.shakya.sugan.etl.dao;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by sugan on 27/08/16.
 */
public class OrderDao {

    @PersistenceContext
    private EntityManager em;

    // Create
    @Transactional
    public void persist(Order Order){
        em.persist(Order);
    }

    // Read
    public Order getOrder(long id){
        Order Order=null;
        // TODO
        // Read Order from database
        return Order;
    }

    public List<Order> getAllOrder(){
        List<Order> OrderList=null;
        // TODO
        // Read all Order from database
        return OrderList;
    }

    public List<Order> getOrder(Customer customer){
        List<Order> OrderList=null;
        // TODO
        // Read all Order made by the customer
        return OrderList;
    }

    public List<Order> getOrder(Product product){
        List<Order> OrderList=null;
        // TODO
        // Read all Order for the product
        return OrderList;
    }

    // Update
    public void update(Order Order){
        // TODO
    }

    // Delete
    @Transactional
    public void remove(long OrderId){
        // TODO
    }

    @Transactional
    public void remove(Order Order){
        em.remove(Order);
    }
}
