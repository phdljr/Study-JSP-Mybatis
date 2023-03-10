package phdljr.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import phdljr.vo.StudentVO;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource(name = "sqlSession")
    private SqlSessionTemplate sqlSession;

    public List<StudentVO> getStudents() {
        List<StudentVO> result = sqlSession.selectList("test.selectStudent");
        return result;
    }

    public StudentVO getStudentsByProc(Long id) {
        StudentVO result = sqlSession.selectOne("test.PRselectStudent", id);
        System.out.println(result);
        return result;
    }
}
