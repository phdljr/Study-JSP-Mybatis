package phdljr.controller;

import lombok.RequiredArgsConstructor;
import net.sf.json.JSONArray;
import net.sf.json.spring.web.servlet.view.JsonView;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import phdljr.service.StudentService;
import phdljr.vo.StudentVO;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    @ResponseBody
    public ModelAndView student() {
        List<StudentVO> students = studentService.getStudents();
        JSONArray result = JSONArray.fromObject(students);

        ModelAndView mv = new ModelAndView();
        mv.addObject("students", result.toString());
        mv.setViewName("student");
        return mv;
    }

    @GetMapping("/id/{id}")
    public ModelAndView getStudentById(@PathVariable Long id) {
        StudentVO studentVO = studentService.getStudentsByProc(id);

        ModelAndView mv = new ModelAndView();
        mv.addObject("student", studentVO);
        mv.setViewName("student");
        return mv;
    }

    @GetMapping("/nickname/{nickname}")
    public ModelAndView getStudentByName(@PathVariable String nickname) {
        StudentVO studentVO = studentService.getStudentByName(nickname);

        ModelAndView mv = new ModelAndView();
        mv.addObject("student", studentVO);
        mv.setViewName("student");
        return mv;
    }

    @GetMapping("/insert")
    public String showInsertStudentForm() {
        return "student-insert";
    }

    @PostMapping("/insert")
    public String insertStudent(StudentVO studentVO) {
        studentService.insertStudent(studentVO);
        return "redirect:/student";
    }
}
