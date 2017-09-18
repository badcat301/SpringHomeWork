package service;

import pojo.User;

import java.util.List;

public interface UserService {


    void save(User user);

    void remove(User user);

    User getById(int id);

    User getUserByEmail(String email);

    List<User>  getAll();

}
