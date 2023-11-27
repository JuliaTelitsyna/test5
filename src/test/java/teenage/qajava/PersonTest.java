package teenage.qajava;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest

{
    @DataProvider(name ="Dannye")
    Object [][] dataProvider()
    {return new Object[][]
            {{13,true},
                    {12,false},
                    {5,false},
                    {18,true},
                    {19,true},
                    {20,false},


            };

    }
    @Test(dataProvider = "Dannye")
    void proverka (int voz,boolean res)
    {
        boolean result =Person.isTeenager(voz);
        assertEquals(res,result);
        System.out.println("для "+voz+ "проверено");
    }
}
