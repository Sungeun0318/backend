package day06.과제;

public class ParkingLot {
    public int calculateFee(int minutes) {
        int b;

        if(minutes <= 30) b = 1000;
        else {
            b = (minutes - 30) / 10;
            b *= 500;
            b += 1000;
        }
        b = b > 20000? 20000 : b;

        return b;
    }
}