package org.example.jetBrainsAcademy.lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnDescTest {

    @Test
    void decrypt() {
        assertEquals("Welcome to hyperskill!", EnDescription.enDecrypt("\\jqhtrj%yt%m~ujwxpnqq&", 5, "dec"));
    }

    @Test
    void encrypt() {
        assertEquals("\\jqhtrj%yt%m~ujwxpnqq&", EnDescription.enDecrypt("Welcome to hyperskill!", 5, "enc"));
    }
}