package com.example.UberReviewServiceApplication.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

//@Inheritance(strategy = InheritanceType.JOINED)
public class Booking extends BaseModels {

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Review review;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Column(nullable = true)
    private Long totalDistance;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startingTime;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Driver driver;



}
