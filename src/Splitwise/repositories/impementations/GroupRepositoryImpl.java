package Splitwise.repositories.impementations;

import Splitwise.models.Group;
import Splitwise.repositories.GroupRepository;

import java.util.HashMap;
import java.util.Map;

public class GroupRepositoryImpl implements GroupRepository {
    Map<String, Group> groups;

    public GroupRepositoryImpl() {
        this.groups = new HashMap<>();
    }

    @Override
    public Group add(Group group) {
        return groups.put(group.getId(), group);
    }

    @Override
    public Group get(String groupId) {
        return groups.get(groupId);
    }

    @Override
    public boolean update(String groupId, Group group) {
        groups.put(groupId, group);
        return true;
    }
}
