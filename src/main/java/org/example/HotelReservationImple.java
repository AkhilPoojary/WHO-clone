package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationImple implements HotelResevationService {
    @Override
    public void hotelBook() {
        List<Hotel> hotel=new ArrayList<>();
            Scanner sc=new Scanner(System.in);
            System.out.println("reservation for regular customer");
            System.out.println("ask the customer to enter the name of the hotel");
            System.out.println("select 1.LAKE WOOD rating 3* 2.BRIDGE WOOD  rating 4* 3.RIDGE WOOD  rating 5*");
            int choice=sc.nextInt();
            if(choice==1)
            {
              String hotelName="Lake Wood";
               int weekDayCostForRegularCustomer=110;
               int weekDayCostForRewardCustomer=80;
               int weekEndDayCostForRegularCustomer=90;
               int weekEndDayCostForRewardCustomer=80;
               int rating=3;

                Hotel h=new Hotel( hotelName,weekDayCostForRegularCustomer,
                        weekDayCostForRewardCustomer, weekEndDayCostForRegularCustomer,
                        weekEndDayCostForRewardCustomer,
                        rating);
                hotel.add(h);
                System.out.println("reservation is done on hotel");
            }
            else if(choice==2)
            {
                String hotelName="Bridge Wood";
                int weekDayCostForRegularCustomer=160;
                int weekDayCostForRewardCustomer=110;
                int weekEndDayCostForRegularCustomer=60;
                int weekEndDayCostForRewardCustomer=50;
                int rating=4;

                Hotel h=new Hotel( hotelName,weekDayCostForRegularCustomer,
                        weekDayCostForRewardCustomer, weekEndDayCostForRegularCustomer,
                        weekEndDayCostForRewardCustomer,
                        rating);
                hotel.add(h);
                System.out.println("reservation is done on hotel");
            }
            else if(choice==3)
            {
                String hotelName="Ridge Wood";
                int weekDayCostForRegularCustomer=220;
                int weekDayCostForRewardCustomer=100;
                int weekEndDayCostForRegularCustomer=150;
                int weekEndDayCostForRewardCustomer=40;
                int rating=4;

                Hotel h=new Hotel( hotelName,weekDayCostForRegularCustomer,
                        weekDayCostForRewardCustomer, weekEndDayCostForRegularCustomer,
                        weekEndDayCostForRewardCustomer,
                        rating);
                hotel.add(h);
                System.out.println("reservation is done on hotel");
            }
            else {
                System.out.println("invalid please enter the valid data");
            }
        }

        

}
