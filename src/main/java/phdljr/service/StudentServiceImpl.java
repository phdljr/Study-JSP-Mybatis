package phdljr.service;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import phdljr.vo.StudentVO;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource(name = "sqlSession")
    private SqlSessionTemplate sqlSession;

    @Override
    public List<StudentVO> getStudents() {
        List<StudentVO> result = sqlSession.selectList("test.selectStudent");
        return result;
    }

    @Override
    public StudentVO getStudentsByProc(Long id) {
        StudentVO result = sqlSession.selectOne("test.PRselectStudent", id);
        return result;
    }

    @Override
    public StudentVO getStudentByName(String nickname){
        StudentVO result = sqlSession.selectOne("test.PRselectStudentByNickname", nickname);
        return result;
    }

    @Override
    public Long insertStudent(StudentVO studentVO) {
        int result = sqlSession.insert("test.PRinsertStudent", studentVO);
        return (long)result;
    }
}
