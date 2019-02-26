package xx.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xinput
 * @Date: 2019-01-08 17:57
 * @Versioin: 1.0.0
 * @Description:
 */
@RestController
public class Controller {

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") String id) {
        System.out.println("id = " + id);
        return id;
    }
}
