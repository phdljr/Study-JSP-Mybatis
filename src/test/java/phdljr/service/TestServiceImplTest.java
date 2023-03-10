package phdljr.service;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import phdljr.vo.StudentVO;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = {
        "file:src/main/webapp/WEB-INF/spring/root-context.xml",
        "file:src/main/webapp/WEB-INF/spring/servlet-context.xml",
        "file:src/main/webapp/WEB-INF/spring/datasource-context.xml"
})
public class TestServiceImplTest extends TestCase {

    @Autowired
    private TestService testService;

    @Test
    public void getStudent(){
        List<StudentVO> students = testService.getStudents();
        assertThat(students).isNotEmpty();
    }
}