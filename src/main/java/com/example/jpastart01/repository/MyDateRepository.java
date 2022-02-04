package com.example.jpastart01.repository;

import com.example.jpastart01.model.MyDate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDateRepository extends JpaRepository<MyDate, Integer> {

}
