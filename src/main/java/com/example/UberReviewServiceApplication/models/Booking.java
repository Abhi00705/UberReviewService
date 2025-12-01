package com.example.UberReviewServiceApplication.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

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
    private Long TotalDistance;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date StartingTime;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date EndTime;


}
