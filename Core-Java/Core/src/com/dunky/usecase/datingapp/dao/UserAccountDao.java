package com.dunky.usecase.datingapp.dao;

import com.dunky.usecase.datingapp.entity.UserAccount;

import java.util.List;

public interface UserAccountDao {
    void save(UserAccount userAccount);
    List<UserAccount> findAll();
    List<UserAccount> findMatches(int age,  String city);
    void delete(int id);

}
