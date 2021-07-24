import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TestClass {
    Calculator cal=new Calculator();

    //@Test, @BeforeEach, @AfterEach, @AfterAll, @BeforeAll

    @Test
    public void addTest(){
        assertEquals(11,cal.add(5,6),"Add test fail" ) ;
        assertEquals(10,cal.add(5,5),"Add test fail" ) ;
        assertEquals(1,cal.add(-5,6),"Add test fail" ) ;
        assertEquals(9,cal.add(5,4),"Add test fail" ) ;
    }
    @Test
    public void divisionTest(){
        assertEquals(3,cal.divide(15,5),"Test Failed");
        assertNull(cal.divide(15,0),"Test Failed");


    }

}
