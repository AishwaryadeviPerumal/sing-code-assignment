package com.singtel.solution2.animal.resource;

import com.singtel.solution2.animal.model.Chicken;
import com.singtel.solution2.animal.model.response.Response;
import com.singtel.solution2.animal.service.AnimalService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AnimalControllerTest {

    @InjectMocks
    AnimalController animalController;

    @Mock
    AnimalService animalService;

    @Test
    public void getAllAnimalsTest_happy_flow(){
        when(animalService.getAllAnimals()).thenReturn(List.of(new Chicken()));
        ResponseEntity<Response> responseEntity=animalController.getAllAnimals();
        Response body=responseEntity.getBody();
        Assert.assertTrue(body instanceof Response);
        Assert.assertTrue(body.getData()!=null);
        Assert.assertTrue(body.getData().size()==1);
        Assert.assertTrue(body.getMetaInfo()!=null);
        Assert.assertEquals("success",body.getMetaInfo().getMessage());
        Assert.assertEquals(200,body.getMetaInfo().getStatusCode().intValue());
    }

    @Test
    public void getAllAnimalsTest_exception_flow(){
        when(animalService.getAllAnimals()).thenThrow(new NullPointerException());
        ResponseEntity<Response> responseEntity=animalController.getAllAnimals();
        Response body=responseEntity.getBody();
        Assert.assertTrue(body instanceof Response);
        Assert.assertTrue(body.getData()==null);
        Assert.assertNotEquals("success",body.getMetaInfo().getMessage());
        Assert.assertEquals(500,body.getMetaInfo().getStatusCode().intValue());
    }
}
