package com.productionspring.repository;

import kg.kstu.production.entity.Employee;
import kg.kstu.production.entity.ProductProduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductProductionRepository extends JpaRepository<ProductProduction, Long> {
    public Integer countByEmployee(Employee employee);
}
