package ru.smartfridge;

import org.springframework.stereotype.*;

@Component
public class FridgeDtoMapper {

    public FridgeDto map(Fridge fridge) {
        return FridgeDto.builder()
                .id(fridge.getId())
                .model(fridge.getModel())
                .productDate(fridge.getProductDate())
                .build();
    }
}
