package ru.bmstu.anime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import ru.bmstu.anime.pojo.Client;
import ru.bmstu.anime.pojo.Role;
import ru.bmstu.anime.repositories.ClientRepository;

import javax.servlet.http.HttpSession;

@Repository
public class BasicController {

    @Autowired
    private ClientRepository clientRepository;

    private static final String USER_ID_ATTR = "userId";
    private static final String USER_ROLE_ATTR = "role";

    protected boolean checkAdminPermissions(HttpSession session) {
        int userID = Integer.getInteger(session.getAttribute(USER_ID_ATTR).toString());
        clientRepository.findById(userID);


    }

    protected boolean checkUserAuthenticated(HttpSession session) {
        return session.getAttribute(USER_ID_ATTR) ==
    }
}
