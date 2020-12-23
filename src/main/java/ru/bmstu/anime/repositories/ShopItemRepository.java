package ru.bmstu.anime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bmstu.anime.pojo.AnimeItem;
import ru.bmstu.anime.pojo.Client;
import ru.bmstu.anime.pojo.Item;

import java.util.List;

@Repository
public interface ShopItemRepository extends JpaRepository<AnimeItem, Integer> {
    public List<Item> findByUserId(int userId);
}
