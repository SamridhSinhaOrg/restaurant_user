package com.samridh.User.info.repository;

import com.samridh.User.info.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
