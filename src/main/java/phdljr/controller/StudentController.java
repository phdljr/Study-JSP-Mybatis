package phdljr.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import phdljr.service.StudentService;
import phdljr.vo.StudentVO;

import java.util.List;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ModelAndView student() {
        List<StudentVO> students = studentService.getStudents();
        JSONArray result = JSONArray.fromObject(students);
        log.info("{}", result);

        ModelAndView mv = new ModelAndView();
        mv.addObject("students", result.toString());
        mv.setViewName("student");
        return mv;
    }

    @GetMapping("/id/{id}")
    @ResponseBody
    public StudentVO getStudentById(@PathVariable Long id) {
        StudentVO studentVO = studentService.getStudentsByProc(id);
        return studentVO;
    }

    @GetMapping("/nickname/{nickname}")
    @ResponseBody
    public StudentVO getStudentByName(@PathVariable String nickname) {
        StudentVO studentVO = studentService.getStudentByName(nickname);
        return studentVO;
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
