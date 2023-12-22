package me.emsi.clientservice.repository;

import me.emsi.clientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client,Long> { }
