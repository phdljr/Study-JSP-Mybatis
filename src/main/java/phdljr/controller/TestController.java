package phdljr.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import phdljr.service.TestService;
import phdljr.vo.StudentVO;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestService testService;

    @GetMapping("/hello")
    public String index1() {
        return "hello";
    }

    @GetMapping("/hello2")
    @ResponseBody
    public String index2() {
        return "안녕하세요";
    }

    @GetMapping("/student")
    @ResponseBody
    public List<StudentVO> student() {
        return testService.getStudents();
    }

    @GetMapping("/student/{id}")
    public ModelAndView showStudentById(@PathVariable Long id) {
        StudentVO studentVO = testService.getStudentsByProc(id);

        ModelAndView mv = new ModelAndView();
        mv.addObject("student", studentVO);
        mv.setViewName("student");
        return mv;
    }

    @GetMapping("/student/{nickname}")
    public ModelAndView showStudentByName(@PathVariable String nickname) {
        StudentVO studentVO = testService.getStudentByName(nickname);

        ModelAndView mv = new ModelAndView();
        mv.addObject("student", studentVO);
        mv.setViewName("student");
        return mv;
    }

    @GetMapping("/exception")
    public void exception() throws Exception {
        throw new ClassNotFoundException();
    }

}
