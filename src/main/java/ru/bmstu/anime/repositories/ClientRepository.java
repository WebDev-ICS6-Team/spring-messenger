package ru.bmstu.anime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bmstu.anime.pojo.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> { }
