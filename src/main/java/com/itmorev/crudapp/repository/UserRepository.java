package com.itmorev.crudapp.repository;

import com.itmorev.crudapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

}
