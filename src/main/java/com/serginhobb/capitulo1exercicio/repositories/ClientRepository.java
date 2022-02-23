package com.serginhobb.capitulo1exercicio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serginhobb.capitulo1exercicio.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}