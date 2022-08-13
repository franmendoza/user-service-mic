package com.fran.userservicemic.repository;

import com.fran.userservicemic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UseRepository extends JpaRepository<User, Integer> {
}
