class HotelFacade {
    private RoomSubsystem roomSubsystem;
    private PaymentSubsystem paymentSubsystem;

    public HotelFacade() {
        this.roomSubsystem = new RoomSubsystem();
        this.paymentSubsystem = new PaymentSubsystem();
    }

    public void checkRoomAvailability(int roomNumber) {
        boolean isAvailable = roomSubsystem.checkAvailability(roomNumber);
        if (isAvailable) {
            System.out.println("номер " + roomNumber + " свободен.");
        } else {
            System.out.println("номер " + roomNumber + " занят.");
        }
    }

    public void bookRoom(int roomNumber) {
        roomSubsystem.bookRoom(roomNumber);
    }

    public void payForStay(int paymentOption) {
        switch (paymentOption) {
            case 1:
                paymentSubsystem.payByCash();
                break;
            case 2:
                paymentSubsystem.payByCard();
                break;
            default:
                System.out.println("неверный способ.");
                break;
        }
    }
}
