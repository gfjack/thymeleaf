package com.example.thymeleaf.repository;

import com.example.thymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findById(long id);

	void deleteById(Long id);
}
