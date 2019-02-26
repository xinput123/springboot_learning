package thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: xinput
 * @Date: 2019-02-22 14:59
 * @Versioin: 1.0.0
 * @Description: 这里只能使用 @Controller注解，而不是@RestController
 * 是因为这里返回一个页面而不是一个值，如果只是使用@RestController注解Controller，
 * 则Controller中的方法无法返回jsp页面，配置的视图解析器InternalResourceViewResolver不起作用，
 * 返回的内容就是Return 里的内容。
 */
@Controller
public class UserWebFluxController {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String allUsers(Model model) {
        model.addAttribute("name", "xinput");
        model.addAttribute("city", "北京");

        return "user";
    }


}
