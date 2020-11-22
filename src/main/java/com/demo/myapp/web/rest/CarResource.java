package com.demo.myapp.web.rest;

import com.demo.myapp.service.dto.CarDTO;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarResource {
    private final Logger log = LoggerFactory.getLogger(CarResource.class);
    private Map<String, CarDTO> map = new HashMap<>();

    public CarResource() {}

    @PostMapping("/cars")
    public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO car) throws URISyntaxException {
        log.debug("REST request to save User : {}", car);
        String id = UUID.randomUUID().toString();
        car.setId(id);
        map.put(id, car);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/cars")
    public ResponseEntity<Collection<CarDTO>> getAllCars() {
        return ResponseEntity.ok(map.values());
    }
}
