package com.project.spring.repositories;


import com.project.spring.model.Order;
import com.project.spring.model.AppUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(AppUser user);
    Page<Order> findByUser_Id(Long userId, Pageable pageable);
}
