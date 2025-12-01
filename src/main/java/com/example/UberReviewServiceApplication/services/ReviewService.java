package com.example.UberReviewServiceApplication.services;

import com.example.UberReviewServiceApplication.Repository.BookingRepository;
import com.example.UberReviewServiceApplication.Repository.ReviewRepository;
import com.example.UberReviewServiceApplication.models.Review;
import com.example.UberReviewServiceApplication.models.Booking;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;
    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("============");

//        Review r = Review
//                .builder()
//                .content("worse ride")
//                .rating(9.0)
//                .build();
//
//        Booking b = Booking
//                .builder()
//                .review(r)
//                .TotalDistance(10L)
//                .EndTime(new Date())
//                .build();
////        reviewRepository.save(r);
//        bookingRepository.save(b);
//        System.out.println(r);

//        System.out.println(r.getId());
//        List<Review> data= reviewRepository.findAll();
//        for(Review data1: data){
//            System.out.println(data1);
//        }
//        reviewRepository.deleteById(2L);

        Optional<Booking> b = bookingRepository.findById(252L);
        if(b.isPresent()){
            bookingRepository.delete(b.get());
        }

    }

}
