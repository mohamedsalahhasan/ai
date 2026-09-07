package com.example.aicodingagent.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class FileTools {

    @Tool(description = "Read the content of a source code file")
    public String readFile(String filePath) {

        try {
            return Files.readString(Path.of(filePath));
        } catch (Exception e) {
            return "Could not read file: " + e.getMessage();
        }
    }
}