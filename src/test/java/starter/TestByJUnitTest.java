package starter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
@DisplayName("JUnit Tests")
public class TestByJUnitTest {
    @Test
    @DisplayName("A passing JUnit test")
    public void aPassingTest() {
        // This test will pass
    }

    @Test
    @DisplayName("A failing JUnit test")
    public void aFailingTest() {
        // This test will fail
        throw new AssertionError("This test is designed to fail");
    }
}
