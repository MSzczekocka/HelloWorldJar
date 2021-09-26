package com.test.HelloWorldJar;

import com.test.HelloWorldJar.controller.HelloWorldController;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringJUnit4ClassRunner.class)
public class DownloadTest {

    private MockMvc mockMvc;
    @InjectMocks
    private HelloWorldController helloWorldController;

    @Before
    public void setUp() throws Exception{

        mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController)
                .build();
    }


    @Test
    public void fileExist() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/hello")
                )
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
