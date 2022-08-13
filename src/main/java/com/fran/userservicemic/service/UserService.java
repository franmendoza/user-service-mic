package com.fran.userservicemic.service;

import com.fran.userservicemic.entity.User;
import com.fran.userservicemic.repository.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    final UseRepository userRepository;

    @Autowired
    public UserService(UseRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public User save(User user){
        User userNew= userRepository.save(user);
        return userNew;
    }

}