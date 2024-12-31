package Splitwise.repositories;

import Splitwise.models.User;
import Splitwise.requests.UserRequest;

public interface UserRepository {
    public User add(UserRequest userRequest);
    public User getById(String id);
}
