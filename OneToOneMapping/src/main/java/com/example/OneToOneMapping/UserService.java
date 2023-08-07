package com.example.OneToOneMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserInfoRepository userInfoRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> fetchAll(){
        return userRepository.findAll();
    }
    public User fetchById(Long id){
        return userRepository.findById(id).orElse(null);
    }


    public User updateUser(User user) {
        User existingUser=userRepository.findById(user.getUserId()).get();
        existingUser.setUserName(user.getUserName());
        existingUser.setEmail(user.getEmail());
        existingUser.setUserInfo(user.getUserInfo());
        User updateUser=userRepository.save(existingUser);
        return updateUser;
    }
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);

    }
}
