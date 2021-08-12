package com.singtel.solution2.animal.util;

import com.singtel.solution2.animal.model.Butterfly;
import com.singtel.solution2.animal.model.Caterpillar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TransformInsectUtilTest {

    @Test
    public void butterflyToCaterpillarTest(){
        Caterpillar caterpillar= TransformInsectUtil.butterflyToCaterpillar(new Butterfly());
        assertTrue(caterpillar instanceof Caterpillar);
    }
}
