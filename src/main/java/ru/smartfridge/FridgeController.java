package ru.smartfridge;

import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/fridges")
@RequiredArgsConstructor
public class FridgeController {

    private final FridgeService fridgeService;

    @GetMapping
    public List<FridgeDto> getAll(@RequestParam long userId) {
        return fridgeService.getAll(userId);
    }

    @GetMapping("/{id}")
    public FridgeDto get(@PathVariable long id) {
        return fridgeService.get(id);
    }

}
