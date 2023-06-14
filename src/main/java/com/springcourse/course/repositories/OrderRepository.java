package com.springcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
