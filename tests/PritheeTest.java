import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class PritheeTest {

    @Test
    void simpleGameRunTest() {
        // User input (provide a few guesses so program can finish)
        String input = "test1\ntest2\ntest3\ntest4\n";

        // Get output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(output));

        // Run the program
        Prithee.main(new String[]{});

        // Restore original in and out
        System.setIn(originalIn);
        System.setOut(originalOut);

        // Check that the program printed "Game over!" at the end
        String printed = output.toString();
        assertTrue(printed.contains("Game over!"));
    }
}
