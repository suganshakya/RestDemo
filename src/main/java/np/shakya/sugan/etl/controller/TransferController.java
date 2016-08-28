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
@RequestMapping(value = "/transfer")
public class TransferController {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/customer/{org1}/{org2}", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String transferCustomer(@PathVariable("org1") String org1, @PathVariable("org2") String org2) {
        //TODO
        // Read a customer with id from ebay
        /*
        SQL Statement = "INSERT INTO table1 (column1, column2, ....)
            SELECT col1, col2, ...
            FROM table2;
         */
        return null;
    }

    @RequestMapping(value = "/order/{org1}/{org2}", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String transferOrder(@PathVariable("org1") String org1, @PathVariable("org2") String org2) {
        //TODO
        // Read an order of given id from ebay
        return null;
    }

    @RequestMapping(value = "/product/{org1}/{org2}", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String transferProduct(@PathVariable("org1") String org1, @PathVariable("org2") String org2) {
        //TODO
        return null;
    }

    @RequestMapping(value = "/whole/{org1}/{org2}", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String transferWhole(@PathVariable("org1") String org1, @PathVariable("org2") String org2) {
        //TODO
        return null;
    }

    @RequestMapping(value = "/add/{tableName}/{columnName}", method = RequestMethod.POST)
    @ResponseBody
    public void addColumn(@PathVariable("tableName") String tableName, @PathVariable("columnName") String columnName) {
        // TODO
        /**
         *  ALTER TABLE tableName
         *  ADD columnName dataType;
         */
    }

    @RequestMapping(value = "/remove/{tableName}/{columnName}", method = RequestMethod.POST)
    @ResponseBody
    public void removeColumn(@PathVariable("tableName") String tableName, @PathVariable("columnName") String columnName) {
        // TODO
        /**
         * ALTER TABLE tableName
         * DROP COLUMN columnName
         */
    }

    public void nullEntryCheck() {
        // TODO
    }

    public void trimString() {
        // TODO
    }

    public void removeDuplicateRow() {
        //TODO
    }

    public void constraintCheck() {
        // TODO
    }


}
