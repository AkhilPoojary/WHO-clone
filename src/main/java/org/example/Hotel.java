package org.example;

public class Hotel {
    private  String hotelName;
    private int weekDayCostForRegularCustomer;
    private int weekDayCostForRewardCustomer;
    private int weekEndDayCostForRegularCustomer;
    private int weekEndDayCostForRewardCustomer;
    private int rating;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
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

    public Hotel(String hotelName, int weekDayCostForRegularCustomer, int weekDayCostForRewardCustomer, int weekEndDayCostForRegularCustomer, int weekEndDayCostForRewardCustomer, int rating) {
        this.hotelName = hotelName;
        this.weekDayCostForRegularCustomer = weekDayCostForRegularCustomer;
        this.weekDayCostForRewardCustomer = weekDayCostForRewardCustomer;
        this.weekEndDayCostForRegularCustomer = weekEndDayCostForRegularCustomer;
        this.weekEndDayCostForRewardCustomer = weekEndDayCostForRewardCustomer;
        this.rating = rating;
    }

    public int getWeekEndDayCostForRegularCustomer() {
        return weekEndDayCostForRegularCustomer;
    }

    public void setWeekEndDayCostForRegularCustomer(int weekEndDayCostForRegularCustomer) {
        this.weekEndDayCostForRegularCustomer = weekEndDayCostForRegularCustomer;
    }

    public int getWeekEndDayCostForRewardCustomer() {
        return weekEndDayCostForRewardCustomer;
    }

    public void setWeekEndDayCostForRewardCustomer(int weekEndDayCostForRewardCustomer) {
        this.weekEndDayCostForRewardCustomer = weekEndDayCostForRewardCustomer;
    }

    @Override
    public String toString() {
        return "HotelReservation{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayCostForRegularCustomer=" + weekDayCostForRegularCustomer +
                ", weekDayCostForRewardCustomer=" + weekDayCostForRewardCustomer +
                ", weekEndDayCostForRegularCustomer=" + weekEndDayCostForRegularCustomer +
                ", weekEndDayCostForRewardCustomer=" + weekEndDayCostForRewardCustomer +
                ", rating=" + rating +
                '}';
    }
}
