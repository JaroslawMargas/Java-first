package org.example.Themes.Interface.Example01;

public class ConsoleLogger implements Logger {

    // ConsoleLogger implements Logger so we have to write implementation of method log();
    @Override
    public void log(String text) {
        System.out.println(text);
    }
}
