package ru.bmstu.anime.pojo;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Order")
public class Order {

    public static final String PK_NAME = "orderId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int orderSumPrice;

    private int orderedBy;

    @ElementCollection
    @OneToMany(fetch = FetchType.EAGER, mappedBy = PK_NAME)
    private List<Item> items;
}
