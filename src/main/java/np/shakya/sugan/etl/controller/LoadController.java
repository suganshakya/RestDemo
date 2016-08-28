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
 * Created by sugan on 28/08/16.
 */
@Controller
@RequestMapping(value = "/etl")
public class LoadController {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/load/csv/{filter}", method = RequestMethod.GET)
    @ResponseBody
    public String loadCsv(@PathVariable("filter") String filter){
        //TODO
        // Load the database into csv format

        /*
        String SQL_Statement = "SELECT column1, column2, ...
            FROM table_name
            INTO OUTFILE 'path_to_file'
            FIELDS TERMINATED BY ','
            ENCLOSED BY '"'
            LINES TERMINATED BY '\n';
         */

        return null;
    }

    @RequestMapping(value = "/load/xls/{filter}", method = RequestMethod.GET)
    @ResponseBody
    public String loadExcel(@PathVariable("filter") String filter){
        //TODO
        // Load the database into xls format
        return null;
    }

    @RequestMapping(value = "/load/xml/{filter}", method = RequestMethod.GET)
    @ResponseBody
    public String loadXml(@PathVariable("filter") String filter){
        //TODO
        // Load the database into xml format
        return null;
    }

    public void nullEntryCheck(){
        // TODO
    }

    public void trimString(){
        // TODO
    }

    public void removeDuplicateRow(){
        //TODO
    }

    public void constraintCheck(){
        // TODO
    }




}
