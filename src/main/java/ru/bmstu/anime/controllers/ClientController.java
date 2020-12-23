package ru.bmstu.anime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.bmstu.anime.config.ClientSession;
import ru.bmstu.anime.pojo.Client;
import ru.bmstu.anime.repositories.ClientRepository;

import javax.servlet.http.HttpSession;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

//    public ClientController(ClientRepository clientRepository) {
//        this.clientRepository = clientRepository;
//    }
//
//    public void setClientRepository(ClientRepository clientRepository) {
//        this.clientRepository = clientRepository;
//    }

    @PostMapping("/sign_up")
    public ResponseEntity<Client> signUpClient(@RequestBody Client client, HttpSession session) {
        var savedClient = clientRepository.save(client);
        ResponseEntity<Client> responseEntity = new ResponseEntity<>(savedClient, HttpStatus.OK);
        session.setAttribute(ClientSession.USER_ID_SESSION_ATTR, savedClient.getId());

        return responseEntity;
    }

    @PostMapping("/sign_in")
    public ResponseEntity<Client> signInClient(@RequestBody Client client, HttpSession session) {
        System.out.println(clientRepository.findAll().toString());
        var savedClient = clientRepository.findById(client.getId());
        var isClientPresent = savedClient.map(dbClient -> dbClient.getPassword().equals(client.getPassword())).orElse(false);

        ResponseEntity<Client> response;
        if (isClientPresent) {
            response = new ResponseEntity<>(HttpStatus.OK);
            session.setAttribute(ClientSession.USER_ID_SESSION_ATTR, client.getId());
        } else {
            response = new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        return response;
    }

    @PostMapping("/sign_out")
    public ResponseEntity<Void> signOutClient(HttpSession session) {
        session.invalidate();

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
