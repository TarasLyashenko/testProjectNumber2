package com.example.testProjectNumber2.dao;

import com.example.testProjectNumber2.entity.Ship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipDao extends CrudRepository<Ship, Long>
{
    Ship findByModel(String model);
}
