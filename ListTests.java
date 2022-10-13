import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;



public class ListTests {
    @Test 
	public void testFilter() {
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("apple");
        input1.add("banana");
        input1.add("coconut");
        StringChecker sc = new StringChecker(){ 
            public boolean checkString(String s) {
                return s.length() < 6;
            }
        };
        ListExamples.filter(input1, sc);
        ArrayList<String> output = new ArrayList<>();
        output.add("apple");
        assertArrayEquals(output.toArray(),  ListExamples.filter(input1, sc).toArray());
	}
}
