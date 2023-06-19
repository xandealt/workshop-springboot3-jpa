package com.springcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
