package ru.bmstu.anime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.bmstu.anime.pojo.AnimeItem;
import ru.bmstu.anime.pojo.Item;
import ru.bmstu.anime.pojo.Order;
import ru.bmstu.anime.repositories.OrderRepository;
import ru.bmstu.anime.repositories.ShopItemRepository;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShoppingCartController {

    @Autowired
    private ShopItemRepository shopItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/get_cart")
    public ResponseEntity<List<Item>> getShoppingCart(@RequestParam int userID) {
        List<Item> items = shopItemRepository.findByUserId(userID);

        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @PostMapping("/order")
    public ResponseEntity<Order> addOrder(@RequestBody Order order) {
        var isOrderSaved = orderRepository.save(order);

        if
    }
}
