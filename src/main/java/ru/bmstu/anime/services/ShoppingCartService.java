package ru.bmstu.anime.services;

import org.springframework.stereotype.Component;
import ru.bmstu.anime.pojo.Item;

import java.util.List;

@Component
public class ShoppingCartService {
    private List<Item> items;

    public void addItemToShoppingCart() {}
}
