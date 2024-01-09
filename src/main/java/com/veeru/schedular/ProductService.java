package com.veeru.schedular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    @Scheduled(cron = "*/5 * * * * *")
    public void addProduct() {
        Random rand = new Random();
        int upperbound = 250000;
        int int_random = rand.nextInt(upperbound);
        Product product = new Product(int_random, "WaterBattle_" +int_random);
        repository.save(product);
        System.out.println("Inserted product: id: " + product.getId() + " name: " + product.getName() + " Time: " + LocalDateTime.now());
    }

    @Scheduled(cron = "*/15 * * * * *")
    public void displayProduct() {

        List<Product> productList = repository.findAll();

        System.out.println("Product fetched count: " + productList.stream().count() + " Time:" + LocalDateTime.now());
    }
}
