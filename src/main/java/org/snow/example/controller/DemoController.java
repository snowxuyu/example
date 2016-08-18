package org.snow.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**  如何访问页面
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/8/17
 * Time: 22:59
 */
@Controller
public class DemoController {

    @RequestMapping(value = "/index/{name}", method = RequestMethod.GET)
    public String index(@PathVariable(value = "name") String name, Model model) {
        System.out.println(name);
        model.addAttribute("name", name);
        return "index";
    }


    @RequestMapping(value = "/tea/{userName}", method = RequestMethod.GET)
    public String tea(@PathVariable(value = "userName") String userName, Model model) {
        System.out.println(userName);

        model.addAttribute("userName", userName);
        return "tea/index";
    }

}
