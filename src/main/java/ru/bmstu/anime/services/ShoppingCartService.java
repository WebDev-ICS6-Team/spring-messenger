package ru.bmstu.anime.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.bmstu.anime.pojo.Item;
import ru.bmstu.anime.repositories.OrderRepository;
import ru.bmstu.anime.repositories.ShopItemRepository;

import java.util.List;

@Component
public class ShoppingCartService {

    @Autowired
    private ShopItemRepository shopItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    public void addItemToShoppingCart() {

    }
}
