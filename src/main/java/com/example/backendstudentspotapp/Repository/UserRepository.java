package com.example.backendstudentspotapp.Repository;

import com.example.backendstudentspotapp.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {


}
