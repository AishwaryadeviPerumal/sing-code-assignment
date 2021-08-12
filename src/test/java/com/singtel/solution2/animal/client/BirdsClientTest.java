package com.singtel.solution2.animal.client;

import com.singtel.solution2.animal.client.BirdsClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BirdsClientTest {

    private String[] args=null;

    @Test
    public void birdsClientTest(){
        BirdsClient.main(args);
        assert(true);
    }
}
