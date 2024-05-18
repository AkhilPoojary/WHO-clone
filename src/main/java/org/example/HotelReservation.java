package org.example;

public class HotelReservation {
    private  Hotel hotelName;
    private int weekDayCostForRegularCustomer;
    private int weekDayCostForRewardCustomer;
    private int rating;

    @Override
    public String toString() {
        return "HotelReservation{" +
                "hotelName=" + hotelName +
                ", weekDayCostForRegularCustomer=" + weekDayCostForRegularCustomer +
                ", weekDayCostForRewardCustomer=" + weekDayCostForRewardCustomer +
                ", rating=" + rating +
                '}';
    }

    public Hotel getHotelName() {
        return hotelName;
    }

    public void setHotelName(Hotel hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayCostForRegularCustomer() {
        return weekDayCostForRegularCustomer;
    }

    public void setWeekDayCostForRegularCustomer(int weekDayCostForRegularCustomer) {
        this.weekDayCostForRegularCustomer = weekDayCostForRegularCustomer;
    }

    public int getWeekDayCostForRewardCustomer() {
        return weekDayCostForRewardCustomer;
    }

    public void setWeekDayCostForRewardCustomer(int weekDayCostForRewardCustomer) {
        this.weekDayCostForRewardCustomer = weekDayCostForRewardCustomer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public HotelReservation(Hotel hotelName, int weekDayCostForRegularCustomer, int rating, int weekDayCostForRewardCustomer) {
        this.hotelName = hotelName;
        this.weekDayCostForRegularCustomer = weekDayCostForRegularCustomer;
        this.rating = rating;
        this.weekDayCostForRewardCustomer = weekDayCostForRewardCustomer;
    }
}
