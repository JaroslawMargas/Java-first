package org.example.Themes.Interface.Example01;

public class Main {

    public static void main(String[] args) {

        // Logger is an interface, so it is not allowed do:
        // Logger logger = new Logger();

        Logger logger = new ConsoleLogger();
        // or
        // Logger logger = new FileLogger();

        logger.log("Example Interface");

    }
}
