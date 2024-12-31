package Splitwise.requests;

import Splitwise.models.User;

import java.util.ArrayList;
import java.util.List;

public class GroupRequest {
    private String name;
    private String description;
    private String imageUrl;
    List<User> users = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<User> getUsers() {
        return users;
    }
}
