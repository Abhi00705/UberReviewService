package com.example.UberReviewServiceApplication.services;
import java.util.*;
import com.example.UberReviewServiceApplication.Repository.ReviewRepository;
import com.example.UberReviewServiceApplication.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("============");
//        Review r = Review
//                .builder()
//                .content("worse ride")
//                .rating(2.0)
//                .build();
//        System.out.println(r);
//        reviewRepository.save(r);
//        List<Review> data= reviewRepository.findAll();
//        for(Review data1: data){
//            System.out.println(data1);
//        }
        reviewRepository.deleteById(2L);
    }

}
