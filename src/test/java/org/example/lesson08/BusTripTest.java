package org.example.lesson08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTripTest {

    @Test
    void checkCrashOnBridgePass() {
        String heightBridge = "465 453 981 463 1235 871 475 981";
        assertEquals("Will not crash", BusTrip.checkCrashOnBridge(234, 8, heightBridge));
    }

    @Test
    void checkCrashOnBridgeFailed() {
        String heightBridge = "871 205 123 871 1681";
        assertEquals("Will crash on bridge 2", BusTrip.checkCrashOnBridge(211, 5, heightBridge));
    }
}