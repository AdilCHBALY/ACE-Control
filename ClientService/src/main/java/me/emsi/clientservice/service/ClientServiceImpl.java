package me.emsi.clientservice.service;

import me.emsi.clientservice.entity.Client;
import me.emsi.clientservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }
    @Override
    public Client findById(Long id) throws Exception {
        return clientRepository.findById(id).orElseThrow(()->new Exception("Invalid Client ID"));
    }
    @Override
    public void addClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void delete(Long id) throws Exception {
        Client deletedClient = clientRepository.findById(id).orElseThrow(()->new Exception("Invalid Id"));
        clientRepository.delete(deletedClient);
    }

    @Override
    public void update(Client client, Long id) throws Exception {
        Client currentClient = clientRepository.findById(id).orElseThrow(()->new Exception("Invalid Client ID"));
        currentClient.setAge(client.getAge());
        currentClient.setName(client.getName());
        clientRepository.save(currentClient);
    }
}
