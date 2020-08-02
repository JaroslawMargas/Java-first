package org.example.Lesson14;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class School<Room> implements Iterable<Room> {
    private Room r1, r2, r3;

    public Iterator<Room> iterator() {

        return new Iterator<Room>() {
            int currentRoom = 0;

            @Override
            public boolean hasNext() {
                return currentRoom < 3;
            }

            @Override
            public Room next() {
                switch (++currentRoom) {
                    case 1:
                        return r1;
                    case 2:
                        return r2;
                    case 3:
                        return r3;
                }
                throw new NoSuchElementException();
            }

        };
    }
}
