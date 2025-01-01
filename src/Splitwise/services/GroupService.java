package Splitwise.services;

import Splitwise.exceptions.SplitwiseBaseException;
import Splitwise.models.Group;
import Splitwise.requests.GroupRequest;

public interface GroupService {
    public Group add(GroupRequest groupRequest);
    public Group get(String groupId) throws SplitwiseBaseException;
    public Group update(String groupId, GroupRequest groupRequest) throws SplitwiseBaseException;
}
