import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FourColorsSuffice
 */
public class TriangleTest {

    public TriangleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test1() {
        System.out.println("isEquilateral");
        Triangle instance = new Triangle(10,10,10);  //สร้างสามเหลี่ยมด้านเท่า
        boolean expResult = true; //กำหนดผลลัพธ์ที่คาดว่าจะได้ คือ สามเหลี่ยม 10 10 10 ควรจะเป็น สามเหลี่ยมด้านเท่า
        boolean result = instance.isEquilateral(); //เรียก เม็ดธ็อด ว่าเป็นสามเหลี่ยใด้านเท่าหรือไม่
        assertEquals(expResult, result); // ค่าที่คาดว่าจะได้ ต้องตรงกันกับ ผลลัพธ์ที่ได้จริง
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void test2() {
        System.out.println("isIsosceles");
        Triangle instance = new Triangle(10,10,5);;
        boolean expResult = true;
        boolean result = instance.isIsosceles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void test3() {
        System.out.println("isScalene");
        Triangle instance = new Triangle(5,4,3);
        boolean expResult = true;
        boolean result = instance.isScalene();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
