package com.example.jsp.form.repository;

import com.example.jsp.form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
