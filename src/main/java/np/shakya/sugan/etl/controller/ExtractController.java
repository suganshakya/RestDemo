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
public class ExtractController {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/extract/csv/{filter}", method = RequestMethod.POST)
    @ResponseBody
    public String extractCsv(@PathVariable("filter") String filter){
        //TODO
        // Extract the data in csv into database
        /*
        String SQL_Statement = "LOAD DATA INFILE 'path_to_file'
            INTO TABLE table_name
            FIELDS TERMINATED BY ","
            ENCLOSED BY '"'
            LINES TERMINATED BY '\n'
            IGNORE 1 LINES;

         */
        return null;
    }

    @RequestMapping(value = "/extract/xls/{filter}", method = RequestMethod.POST)
    @ResponseBody
    public String extractExcel(@PathVariable("filter") String filter){
        //TODO
        // Extract the data in xls to database
        return null;
    }


    @RequestMapping(value = "/extract/xml/{filter}", method = RequestMethod.POST)
    @ResponseBody
    public String extractXml(@PathVariable("filter") String filter){
        //TODO
        // Extract the data in xml to database
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
