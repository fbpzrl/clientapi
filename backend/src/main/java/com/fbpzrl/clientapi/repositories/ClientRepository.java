package com.fbpzrl.clientapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fbpzrl.clientapi.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
