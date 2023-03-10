package phdljr.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import phdljr.service.TestService;
import phdljr.vo.StudentVO;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestController {

	private final TestService testService;
	
	@GetMapping("/hello")
	public String index() {
		return "hello";
	}
	
	@GetMapping("/student")
	@ResponseBody
	public List<StudentVO> student() {
		return testService.getStudents();
	}

}
