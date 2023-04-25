package de.oceanlabs.mcp.mcinjector.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public enum Blacklist {
    INSTANCE;

    public List<String> load(Path file)
    {
        try
        {
            return Files.readAllLines(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
