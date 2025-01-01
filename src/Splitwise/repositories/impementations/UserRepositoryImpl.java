package Splitwise.repositories.impementations;

import Splitwise.models.User;
import Splitwise.repositories.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<String, User> users;

    public UserRepositoryImpl() {
        this.users = new HashMap<>();
    }

    @Override
    public User add(User user) {
        return users.put(user.getId(), user);
    }

    @Override
    public User getById(String id) {
        return users.get(id);
    }
}
