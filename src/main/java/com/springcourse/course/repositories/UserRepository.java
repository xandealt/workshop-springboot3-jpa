package com.springcourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
