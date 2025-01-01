package Splitwise.services.implementations;

import Splitwise.models.User;
import Splitwise.repositories.UserRepository;
import Splitwise.requests.UserRequest;
import Splitwise.services.UserService;

import java.util.UUID;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User add(UserRequest userRequest) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setEmail(userRequest.getEmail());
        user.setContact(userRequest.getContact());
        user.setName(userRequest.getName());

        return userRepository.add(user);
    }
}
