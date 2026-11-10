package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    // @Test
    // arrange
    // act
    // assert

    @Test
    void checkInAvailableRoom() {
        // arrange
        Room room = new Room(2, 124.00, false, false);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());

    }

}