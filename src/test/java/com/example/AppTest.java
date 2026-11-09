
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetMessage() {

        App app = new App();

        String result = app.getMessage();

        assertEquals(
            "Hello! Maven CI/CD Pipeline is working!",
            result
        );
    }
}
