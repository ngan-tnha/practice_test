package test_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestObject {

    private String topic;
    private String name;
    private String description;

    // Constructor
    public TestObject(String topic, String name, String description) {
        this.topic = topic;
        this.name = name;
        this.description = description;
    }
    
    // Test method
    @Test
    public void testAttribute() {
        String topicAttr = topic;
        switch (topicAttr) {
            case "A":
                assertTrue(name == "a");
                assertTrue(description.length() > 10 && description.length() < 100);
                break;
            case "B":
            	assertTrue(name == "x");
                assertTrue(description.length() < 40);
                break;
            default:
            	fail("Case not yet implemented");
        }
    }
    
    // Parameters for test cases
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"A", "a", "something"},
                {"B", "x", "another thing"},
                {"C", "base", "unknown object"}
        });
    }
}