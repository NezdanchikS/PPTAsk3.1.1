package com.nezdanchik.springboot.pptask.web.service;
import com.nezdanchik.springboot.pptask.web.models.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
    public void updateUser(User user);
}