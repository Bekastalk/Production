package com.productionspring.repository;

import kg.kstu.production.entity.Ingredient;
import kg.kstu.production.entity.Material;
import kg.kstu.production.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredient, Long> {
    void deleteAllByProduct(Optional<Product> product);
    void deleteAllByMaterial(Optional<Material> material);
}
