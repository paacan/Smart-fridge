package ru.smartfridge;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;

@Data
@Entity(name = "fridges")
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String model;
    private LocalDate productDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
