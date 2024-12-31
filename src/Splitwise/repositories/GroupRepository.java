package Splitwise.repositories;

import Splitwise.models.Group;

public interface GroupRepository {
    public Group add(Group group);
    public Group get(String groupId);
    public boolean update(String groupId, Group group);
}
