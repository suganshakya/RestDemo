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
@RequestMapping(value = "/amazon")
public class AmazonController {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/read/customer/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String readCustomer(@PathVariable("id") long id){
        //TODO
        // Read a customer with id from ebay
        return null;
    }

    @RequestMapping(value = "/read/order/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String readOrder(@PathVariable("id") long id){
        //TODO
        // Read an order of given id from ebay
        return null;
    }

    @RequestMapping(value = "/read/product/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String readProduct(@PathVariable("id") long id){
        //TODO
        return null;
    }

    // -------------------------------------------------------------------------------------------------------------//

    @RequestMapping(value = "/read/customers", method = RequestMethod.POST)
    @ResponseBody
    public String readCustomer(){
        //TODO
        // Read a customer with id from ebay
        return null;
    }

    @RequestMapping(value = "/read/orders", method = RequestMethod.POST)
    @ResponseBody
    public String readOrder(){
        //TODO
        // Read an order of given id from ebay
        return null;
    }

    @RequestMapping(value = "/read/products", method = RequestMethod.POST)
    @ResponseBody
    public String readProduct(){
        //TODO
        return null;
    }

    // -------------------------------------------------------------------------------------------------------------//


    @RequestMapping(value = "/push/customer/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String pushCustomer(@PathVariable("id") long id){
        //TODO
        // Read a customer with id from ebay
        return null;
    }

    @RequestMapping(value = "/push/order/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String pushOrder(@PathVariable("id") long id){
        //TODO
        // Read an order of given id from ebay
        return null;
    }

    @RequestMapping(value = "/push/product/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String pushProduct(@PathVariable("id") long id){
        //TODO
        return null;
    }

    // -------------------------------------------------------------------------------------------------------------//


    @RequestMapping(value = "/push/customers", method = RequestMethod.POST)
    @ResponseBody
    public String pushCustomer(){
        //TODO
        // Read a customer with id from ebay
        return null;
    }

    @RequestMapping(value = "/push/orders", method = RequestMethod.POST)
    @ResponseBody
    public String pushOrder(){
        //TODO
        // Read an order of given id from ebay
        return null;
    }

    @RequestMapping(value = "/push/products", method = RequestMethod.POST)
    @ResponseBody
    public String pushProduct(){
        //TODO
        return null;
    }

}
