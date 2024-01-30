package com.test.apiclientserver.controller;

import com.test.apiclientserver.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import com.test.apiclientserver.domain.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/save")
        public ResponseEntity<Client> saveClient(@RequestBody Client client){
            Client clients = clientService.save(client);
            return ResponseEntity.ok(clients);
        }

    @GetMapping("/")
    public ResponseEntity<List<Client>> getAll(){
        return ResponseEntity.ok(clientService.getAll());
    }


}
