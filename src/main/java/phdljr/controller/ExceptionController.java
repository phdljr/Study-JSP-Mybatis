package phdljr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {

    @GetMapping("/exception")
    public void exception() throws Exception {
        throw new ClassNotFoundException();
    }
}
