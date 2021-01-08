package org.example.jetBrainsAcademy.lesson02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CezarCipherTest {

    @Test
    void encryptShift() {
        assertEquals("bjqhtrj yt mdujwxpnqq",CezarCipher.encryptShift("welcome to hyperskill",5));
    }
}