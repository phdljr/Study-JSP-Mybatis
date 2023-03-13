package phdljr.controller;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitWebConfig(locations = {
        "file:src/main/webapp/WEB-INF/spring/root-context.xml",
        "file:src/main/webapp/WEB-INF/spring/servlet-context.xml",
        "file:src/main/webapp/WEB-INF/spring/datasource-context.xml"
})
public class TestControllerStudent extends TestCase {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void homeTest() throws Exception {
        mockMvc.perform(get("hello2"))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"));
    }
}