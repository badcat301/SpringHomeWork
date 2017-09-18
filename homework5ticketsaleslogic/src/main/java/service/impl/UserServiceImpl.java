package service.impl;

import dao.InMemmoryDataBaseSimulator;
import pojo.User;
import service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {


    @Override
    public void save(User user) {

        InMemmoryDataBaseSimulator.getUsers().add(user);
    }

    @Override
    public void remove(User user) {
        InMemmoryDataBaseSimulator.getUsers().remove(user);
    }

    @Override
    public User getById(int id) {

        Optional<User> userOptional = InMemmoryDataBaseSimulator.getUsers().stream().filter(u -> u.getId() == id).findFirst();
        return userOptional.orElse(new User());
    }

    @Override
    public User getUserByEmail(String email) {

        Optional<User> userOptional = InMemmoryDataBaseSimulator.getUsers().stream().filter(e -> e.getEmail().equals(email)).findFirst();
        return userOptional.orElse(new User());
    }

    @Override
    public List<User> getAll() {

        return InMemmoryDataBaseSimulator.getUsers();
    }
}
