package com.example.package1;

class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String msg) {
        super(msg);
    }
}

public class moviebooking {

	public static void main(String[] args) {
		boolean seatAvailable = false;
		try {
        if (!seatAvailable) {
            throw new SeatNotAvailableException("Seat not available");
		} else {
			System.out.println("available you can book fast");
		}
        }
		catch(SeatNotAvailableException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
