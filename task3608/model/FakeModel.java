package com.javarush.task.task17.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return  modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>(new ArrayList<>(Arrays.asList(new User("A", 1, 1),new User("B", 2, 1))));
        modelData.setUsers(users);

    }
}
