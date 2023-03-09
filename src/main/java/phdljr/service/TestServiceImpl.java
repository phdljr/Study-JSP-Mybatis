package phdljr.service;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import phdljr.vo.StudentVO;

@Service
public class TestServiceImpl implements TestService{
	
	@Resource(name="sqlSession")
	private SqlSessionTemplate sqlSession;
	
	public List<StudentVO> getStudents() {
		List<StudentVO> result = sqlSession.selectList("test.selectStudent");
		return result;
	}
}
