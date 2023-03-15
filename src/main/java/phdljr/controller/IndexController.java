package phdljr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/hello")
    public String index1() {
        log.trace("{} {} 출력", "값1", "값2");
        log.debug("{} {} 출력", "값1", "값2");
        log.info("{} {} 출력", "값1", "값2");
        log.warn("{} {} 출력", "값1", "값2");
        log.error("{} {} 출력", "값1", "값2");
        return "hello";
    }

    @GetMapping("/hello2")
    @ResponseBody
    public String index2() {
        return "안녕하세요";
    }
}
