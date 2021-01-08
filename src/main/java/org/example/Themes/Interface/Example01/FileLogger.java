package org.example.Themes.Interface.Example01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void log(String text) {
        try {
            File file = new File("log.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            //ignore
        }

    }
}
