package ru.bmstu.anime.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShoppingCartController {

    @PostMapping
    public ResponseEntity<String> addItemToShoppingCart(@PathVariable String itemId) {
        // Logika dobavleniya v korzinku
        return new ResponseEntity<>("Item added to shopping card successfully", HttpStatus.OK);
    }
}
