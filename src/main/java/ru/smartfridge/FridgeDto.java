package ru.smartfridge;

import lombok.*;

import java.time.*;

@Value
@Builder
public class FridgeDto {

    long id;
    String model;
    LocalDate productDate;
}
