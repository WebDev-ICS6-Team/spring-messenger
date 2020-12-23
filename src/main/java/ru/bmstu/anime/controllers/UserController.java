package ru.bmstu.anime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.bmstu.anime.pojo.AnimeItem;
import ru.bmstu.anime.repositories.AssortmentRepository;
import ru.bmstu.anime.repositories.ShopItemRepository;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController extends BasicController {

    @Autowired
    private AssortmentRepository assortmentRepository;

    @Autowired
    private ShopItemRepository shopItemRepository;

    @GetMapping("/home")
    public ResponseEntity<List<AnimeItem>> homePage() {
        var allAnimeItems = assortmentRepository.findAll();

        return new ResponseEntity<>(allAnimeItems, HttpStatus.OK);
    }

    @PostMapping("/add_to_cart")
    public ResponseEntity<String> addItemToShoppingCart(@RequestBody AnimeItem order, HttpSession session) {
        shopItemRepository.save(order);

        return new ResponseEntity<>("Item added to shopping card successfully", HttpStatus.OK);
    }
}
