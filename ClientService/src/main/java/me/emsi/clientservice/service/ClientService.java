package me.emsi.clientservice.service;

import me.emsi.clientservice.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
    Client findById(Long id) throws Exception;
    void addClient(Client client);

    void delete(Long id) throws Exception;
    void update(Client client,Long id) throws Exception;
}
