package com.productionspring.repository;

import kg.kstu.production.entity.Employee;
import kg.kstu.production.entity.ProductSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSalesRepository extends JpaRepository<ProductSale, Long> {
    public Integer countByEmployee(Employee employee);
}
