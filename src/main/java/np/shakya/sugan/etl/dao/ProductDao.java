package np.shakya.sugan.etl.dao;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by sugan on 27/08/16.
 */
public class ProductDao {

    @PersistenceContext
    private EntityManager em;

    // Create
    @Transactional
    public void persist(Product Product){
        em.persist(Product);
    }

    // Read
    public Product getProduct(long id){
        Product product=null;
        // TODO
        // Read Product from database
        return product;
    }

    public List<Product> getAllProduct(){
        List<Product> productList=null;
        // TODO
        // Read all Product from database
        return productList;
    }

    // Update
    public void update(Product product){
        // TODO
    }

    // Delete
    @Transactional
    public void remove(long productId){
        // TODO
    }

    @Transactional
    public void remove(Product product){
        em.remove(product);
    }
}
