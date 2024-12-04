package ru.smartfridge;

import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface FridgeRepository extends JpaRepository<Fridge, Long> {

    Fridge findById(long id);
    List<Fridge> findByUser(User user);

    List<Fridge> findByUserId(long userId);
}
