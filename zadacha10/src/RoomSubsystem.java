class RoomSubsystem {
    public boolean checkAvailability(int roomNumber) {
        return roomNumber % 2 == 0; // четные свободны, нечетные заняты
    }

    public void bookRoom(int roomNumber) {
        System.out.println("номер " + roomNumber + " забронирован.");
    }
}