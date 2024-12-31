package Splitwise.services;

import Splitwise.models.User;
import Splitwise.requests.UserRequest;

public interface UserService {
    public User add(UserRequest userRequest);
}
