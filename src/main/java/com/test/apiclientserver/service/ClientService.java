package com.test.apiclientserver.service;

import com.test.apiclientserver.domain.Client;
import com.test.apiclientserver.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.findAll();
    }
    public Client save(Client client){
        return clientRepository.save(client);
    }
}
