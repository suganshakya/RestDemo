package np.shakya.sugan.etl.controller;

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
    @RequestMapping(value = "/load/excel/{filter}", method = RequestMethod.GET)
    @ResponseBody
    public String loadExcel(@PathVariable("filter") String filter){
        //TODO
        // Read a customer with id from ebay
        return null;
    }

    @RequestMapping(value = "/load/csv/{filter}", method = RequestMethod.GET)
    @ResponseBody
    public String loadCsv(@PathVariable("filter") String filter){
        //TODO
        // Read a customer with id from ebay
        return null;
    }

    @RequestMapping(value = "/load/xml/{filter}", method = RequestMethod.GET)
    @ResponseBody
    public String loadXml(@PathVariable("filter") String filter){
        //TODO
        // Read a customer with id from ebay
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
