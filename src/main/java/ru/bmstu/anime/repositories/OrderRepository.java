package ru.bmstu.anime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bmstu.anime.pojo.AnimeItem;

@Repository
public interface OrderRepository extends JpaRepository<AnimeItem, Integer> {
}
