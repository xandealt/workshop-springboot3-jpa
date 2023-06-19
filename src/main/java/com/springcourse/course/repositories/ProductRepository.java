package com.springcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
