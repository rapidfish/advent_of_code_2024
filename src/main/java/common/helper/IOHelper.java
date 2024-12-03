package common.helper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOHelper {
    public String readFile(String filename) throws IOException {
        try (var in = getClass().getResourceAsStream("/day1_1.dat")) {
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
