package np.shakya.sugan.etl.controller;

import np.shakya.sugan.etl.dao.CustomerDao;
import np.shakya.sugan.etl.dao.OrderDao;
import np.shakya.sugan.etl.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sugan on 27/08/16.
 */
@Controller
@RequestMapping(value = "/magento")
public class MagentoController {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/read/customer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String readCustomer(@PathVariable("id") long id){
        //TODO
        // Read a customer with id from ebay
        return null;
    }

    @RequestMapping(value = "/read/order/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String readOrder(@PathVariable("id") long id){
        //TODO
        // Read an order of given id from ebay
        return null;
    }

    @RequestMapping(value = "/read/product/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String readProduct(@PathVariable("id") long id){
        //TODO
        return null;
    }











}
