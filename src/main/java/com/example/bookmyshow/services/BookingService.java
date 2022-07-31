package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.BookingRepository;
import com.example.bookmyshow.repositories.ShowSeatRepository;

import java.util.List;

public class BookingService {
    private BookingRepository bookingRepository;
    private ShowSeatRepository showSeatRepository;

    public Booking createBooking(User user, Show show, List<ShowSeat> showSeats){
        return null;
    }
}
