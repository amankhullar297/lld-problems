package Splitwise.services;

import Splitwise.models.Group;
import Splitwise.requests.GroupRequest;

public interface GroupService {
    public Group add(GroupRequest groupRequest);
    public Group get(String groupId);
    public Group update(String groupId, GroupRequest groupRequest);
}
