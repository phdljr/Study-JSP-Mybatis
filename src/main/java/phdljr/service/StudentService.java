package phdljr.service;

import java.util.List;

import phdljr.vo.StudentVO;

public interface StudentService {
	List<StudentVO> getStudents();
	StudentVO getStudentsByProc(Long id);
	StudentVO getStudentByName(String nickname);
	Long insertStudent(StudentVO studentVO);
}
