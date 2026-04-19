package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class MainController {

    @PostMapping("/calculate")
    public List<Map<String, Object>> calculate(@RequestBody List<Map<String, Object>> data) {

        List<Map<String, Object>> result = new ArrayList<>();

        for (Map<String, Object> d : data) {

            int watt = (int) d.get("watt");
            double hours = Double.parseDouble(d.get("hours").toString());

            double kwh = (watt * hours) / 1000;

            Map<String, Object> entry = new HashMap<>();
            entry.put("name", d.get("name"));
            entry.put("kwh", kwh);

            result.add(entry);
        }

        return result;
    }
}