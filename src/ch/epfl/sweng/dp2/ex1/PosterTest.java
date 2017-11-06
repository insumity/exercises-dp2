package ch.epfl.sweng.dp2.ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PosterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testFunctionality() {
        FacebookPoster fb = null;
        // TODO: instantiate fb

        fb.postMessage("Hello World!");
        fb.postMessage("Hello world! Still here!");
        assertEquals("Hello world! Still here!", fb.getMessage(1));

        fb.postMessage("Another day, another post!");
        assertEquals("Another day, another post!", fb.getMessage(2));

        String expectedMessage =
                "Using the NewFacebookPoster.post" +
                "Using the NewFacebookPoster.post" +
                "Using the NewFacebookPoster.get" +
                "Using the NewFacebookPoster.post" +
                "Using the NewFacebookPoster.get";

        assertEquals(expectedMessage, outContent.toString());
    }
}
