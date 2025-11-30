package com.example.UberReviewServiceApplication.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Table(name="bookingReview")
@ToString
public class Review extends BaseModels{


    @Column(nullable=false)
    private String content;

    @Column(nullable=false)
    private Double rating;





//    @Override
//    public java.lang.String toString() {
//        return "Review: "+this.content+" "+this.rating+" "+this.createdAt+" "+this.updatedAt;
//    }
}
