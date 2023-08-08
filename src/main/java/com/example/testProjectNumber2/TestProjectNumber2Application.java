package com.example.testProjectNumber2;

import com.example.testProjectNumber2.dao.ShipDao;
import com.example.testProjectNumber2.entity.Ship;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectNumber2Application implements CommandLineRunner
{
    @Resource
    ShipDao shipDao;

    public static void main(String[] args)
    {
        SpringApplication.run(TestProjectNumber2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Ship ship = new Ship();
        ship.setNumber(2123);
        ship.setModel("Grov");

        Ship ship1 = new Ship();
        ship.setNumber(331);
        ship.setModel("Veliko");

        shipDao.save(ship);
        shipDao.save(ship1);

    }
}
