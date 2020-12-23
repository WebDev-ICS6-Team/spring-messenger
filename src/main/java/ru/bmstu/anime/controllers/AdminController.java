package ru.bmstu.anime.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.bmstu.anime.pojo.AnimeItem;
import ru.bmstu.anime.pojo.Client;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @PostMapping("/{user}")
    public ResponseEntity<Client> grantAdminRole(@PathVariable Client client, HttpSession session) {

    }

    @PostMapping("/add_item")
    public ResponseEntity<AnimeItem> addItemToAssortment(@RequestBody AnimeItem item, HttpSession session) {
        return new ResponseEntity<>(new AnimeItem(), HttpStatus.OK);
    }
}
