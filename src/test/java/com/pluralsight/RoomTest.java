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

    @Test
    void checkInOccupiedRoom() {
        // arrange
        Room room = new Room(2, 124.00, true, false);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isOccupied());
        assertFalse(room.isDirty());
    }

    @Test
    void checkInDirtyRoom() {
        // arrange
        Room room = new Room(2, 124.00, false, true);

        // act
        room.checkIn();

        // assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void checkOutRoom() {
        // arrange
        Room room = new Room(2, 124.00, true, true);

        // act
        room.checkOut();

        // assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    void cleanUnoccupiedRoom() {
        // arrange
        Room room = new Room(2, 124.00, false, true);

        // act
        room.cleanRoom();

        // assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }

    @Test
    void cleanOccupiedRoom() {
        // arrange
        Room room = new Room(2, 124.00, true, true);

        // act
        room.cleanRoom();

        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }


}