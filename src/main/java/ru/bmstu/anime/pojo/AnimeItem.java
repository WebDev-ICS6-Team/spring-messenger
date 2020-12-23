package ru.bmstu.anime.pojo;

import javax.persistence.*;
import java.util.List;

@Entity
public class AnimeItem extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
