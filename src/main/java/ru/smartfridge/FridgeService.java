package ru.smartfridge;

import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@AllArgsConstructor
@Service
public class FridgeService {

    private final FridgeRepository fridgeRepository;
    private final FridgeDtoMapper mapper;

    public List<FridgeDto> getAll(long userId) {
        List<Fridge> fridges = fridgeRepository.findByUserId(userId);
        return fridges.stream()
                .map(mapper::map)
                .toList();
    }

    public FridgeDto get(long id) {
        return mapper.map(fridgeRepository.findById(id));
    }
}

