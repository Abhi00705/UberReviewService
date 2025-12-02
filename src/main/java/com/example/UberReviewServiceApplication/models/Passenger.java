package com.example.UberReviewServiceApplication.models;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger extends BaseModels {
    private String name;

     @OneToMany(mappedBy = "passenger")
    List<Booking> bookingPassenger = new ArrayList<>();
}
