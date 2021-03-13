package com.example.calculator.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class ComputeController {

    private static final Logger logger = LogManager.getLogger(ComputeController.class);

    @GetMapping("/sqroot")
    public double getRoot(@RequestParam double num) {
        logger.info("Calculating square root of " + num);
        return Math.sqrt(num);
    }

    @GetMapping("/factorial")
    public int getFact(@RequestParam int num) {
        logger.info("Calculating factorial root of " + num);
        int result = 1;
        for (int factor = 2; factor <= num; factor++) {
            result *= factor;
        }
        return result;
    }

    @GetMapping("/ln")
    public double getLn(@RequestParam double num) {
        logger.info("Calculating square log of " + num);
        return Math.log(num);
    }

    @GetMapping("/pow")
    public double getPow(@RequestParam int base, @RequestParam int power) {
        logger.info("Calculating square power of " + base + " and " + power);
        return Math.pow(base, power);
    }



}
