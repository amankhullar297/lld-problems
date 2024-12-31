package Splitwise.services.implementations;

import Splitwise.models.User;
import Splitwise.repositories.UserRepository;
import Splitwise.requests.UserRequest;
import Splitwise.services.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User add(UserRequest userRequest) {
        return userRepository.add(userRequest);
    }
}
