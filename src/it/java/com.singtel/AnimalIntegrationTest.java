package com.singtel;

import com.singtel.solution2.animal.model.Chicken;
import com.singtel.solution2.animal.resource.AnimalController;
import com.singtel.solution2.animal.service.AnimalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AnimalController.class)
public class AnimalIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private AnimalService animalService;

    @Test
    public void getAllEmployeesAPI_happy_flow() throws Exception
    {
        when(animalService.getAllAnimals()).thenReturn(List.of(new Chicken()));
        mvc.perform( MockMvcRequestBuilders
                .get("/api/v1/allAnimals")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data").exists());
    }

    @Test
    public void getAllEmployeesAPI_exception_flow() throws Exception
    {
        Integer statusCode=new Integer(500);
        when(animalService.getAllAnimals()).thenThrow(new NullPointerException());
        mvc.perform( MockMvcRequestBuilders
                .get("/api/v1/allAnimals")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is5xxServerError());
    }


}