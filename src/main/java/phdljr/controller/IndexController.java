package phdljr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/hello")
    public String index1() {
        return "hello";
    }

    @GetMapping("/hello2")
    @ResponseBody
    public String index2() {
        return "안녕하세요";
    }
}
