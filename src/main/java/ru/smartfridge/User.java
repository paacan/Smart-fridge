package ru.smartfridge;

import jakarta.persistence.*;
import lombok.Data;
import ru.smartfridge.Fridge;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthday;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Fridge> fridges;
}