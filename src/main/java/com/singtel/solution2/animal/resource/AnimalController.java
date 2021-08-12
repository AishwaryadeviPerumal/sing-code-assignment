package com.singtel.solution2.animal.resource;

import com.singtel.solution2.animal.model.Animal;
import com.singtel.solution2.animal.model.response.MetaInfo;
import com.singtel.solution2.animal.model.response.Response;
import com.singtel.solution2.animal.service.AnimalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping("/allAnimals")
    public ResponseEntity<Response> getAllAnimals(){
        log.info("get AllAnimals started");
        try {
            return prepareResponse(animalService.getAllAnimals(),HttpStatus.OK,"success");
        }catch (Exception e){
            log.info("exception in get AllAnimals");
            e.printStackTrace();
            return prepareResponse(null,HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage());
        }
    }

    private ResponseEntity<Response> prepareResponse(List<Animal> data, HttpStatus httpStatus,String msg){
        Response response=new Response();
        MetaInfo metaInfo =new MetaInfo();
        metaInfo.setStatusCode(httpStatus.value());
        metaInfo.setMessage(msg);
        response.setMetaInfo(metaInfo);
        if(data!=null){
            response.setData(data);
        }
        return new ResponseEntity<>(response,httpStatus);
    }
}
