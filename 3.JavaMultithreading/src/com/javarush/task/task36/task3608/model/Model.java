package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public interface Model {
    ModelData getModelData();
    void loadDeletedUsers();
    void loadUsers();
    void loadUserById(long userid);
    void deleteUserById(long userid);
    void changeUserData(String name, long id, int level);
}
