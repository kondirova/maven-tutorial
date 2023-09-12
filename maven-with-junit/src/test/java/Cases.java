import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cases {

    @Test
    void junitShouldProvideIntelliJFailureDiff() {
        assertEquals("{\"b\":3, \"a\":1}", "{\"b\":3, \"a\":1}");
    }
}
