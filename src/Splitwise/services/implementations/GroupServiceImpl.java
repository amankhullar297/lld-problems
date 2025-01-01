package Splitwise.services.implementations;

import Splitwise.exceptions.GroupNotFoundException;
import Splitwise.exceptions.SplitwiseBaseException;
import Splitwise.models.Group;
import Splitwise.repositories.GroupRepository;
import Splitwise.requests.GroupRequest;
import Splitwise.services.GroupService;

import java.util.UUID;

public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group add(GroupRequest groupRequest) {
        Group group = new Group();
        group.setId(UUID.randomUUID().toString());
        group.setDescription(groupRequest.getDescription());
        group.setName(groupRequest.getName());
        group.setImageUrl(groupRequest.getImageUrl());
        group.setUsers(groupRequest.getUsers());

        return groupRepository.add(group);
    }

    @Override
    public Group get(String groupId) throws SplitwiseBaseException {
        Group group = groupRepository.get(groupId);
        if(group == null)
                throw new GroupNotFoundException(String.format("No group exists with given group id %s", groupId));
        return group;
    }

    @Override
    public Group update(String groupId, GroupRequest groupRequest) throws SplitwiseBaseException {
        Group group = groupRepository.get(groupId);
        if(group == null)
            throw new GroupNotFoundException(String.format("No group exists with given group id %s", groupId));

        group.setId(UUID.randomUUID().toString());
        group.setDescription(groupRequest.getDescription());
        group.setName(groupRequest.getName());
        group.setImageUrl(groupRequest.getImageUrl());
        group.setUsers(groupRequest.getUsers());

        groupRepository.update(groupId, group);
        return group;
    }
}
