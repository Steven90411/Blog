package main.Java.services;

import main.Java.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    // 註冊新用戶
    public User registerUser(User user) {
        users.add(user);
        return user;
    }

    // 用戶登入
    public User loginUser(User user) {
        for (User u : users) {
            if (u.getUserName().equals(user.getUserName()) && u.getPassword().equals(user.getPassword())) {
                return u;
            }
        }
        return null;
    }

    // 查看所有用戶
    public List<User> getAllUsers() {
        return users;
    }

    // 查看特定用戶
    public User getUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) {
                return u;
            }
        }
        return null;
    }

    // 編輯用戶資料
    public User updateUser(int id, User user) {
        for (User u : users) {
            if (u.getUserId() == id) {
                u.setUserName(user.getUserName());
                u.setPassword(user.getPassword());
                u.setCreatedAt(user.getCreatedAt());
                u.setUpdatedAt(user.getUpdatedAt());
                return u;
            }
        }
        return null;
    }

    // 刪除用戶
    public void deleteUser(int id) {
        users.removeIf(u -> u.getUserId() == id);
    }
}
