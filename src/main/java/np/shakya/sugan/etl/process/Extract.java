package np.shakya.sugan.etl.process;

import np.shakya.sugan.etl.dao.CustomerDao;
import np.shakya.sugan.etl.dao.OrderDao;
import np.shakya.sugan.etl.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sugan on 28/08/16.
 */
public class Extract {
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;




}
