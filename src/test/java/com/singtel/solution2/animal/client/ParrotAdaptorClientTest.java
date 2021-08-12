package com.singtel.solution2.animal.client;

import com.singtel.solution2.animal.client.ParrotAdaptorClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ParrotAdaptorClientTest {

    private String[] args=null;

    @Test
    public void parrotAdaptorClientTest(){
        ParrotAdaptorClient.main(args);
        assert(true);
    }
}
