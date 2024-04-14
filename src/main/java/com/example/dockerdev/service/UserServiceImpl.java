package com.example.dockerdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dockerdev.model.User;
import com.example.dockerdev.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @Override
    public void saveUsers(User user){
        this.userRepository.save(user);
    }
    @Override
    public User getUserById(long id){
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if (optional.isPresent()){
            user = optional.get();
        }else {
            throw new RuntimeException("User not found");
        }
        return user;
    }
    @Override
    public void deleteUserById(long id){
        this.userRepository.deleteById(id);
    }
}
