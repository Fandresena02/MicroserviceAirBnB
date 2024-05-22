package org.efrei;

import org.efrei.DAO.UserRepository;
import org.efrei.Entity.Role;
import org.efrei.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public User signup(User user) {
        user.setRole(Role.LOCATAIRE);
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        System.out.println("User"+ user);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("Invalid credentials");
    }
}
