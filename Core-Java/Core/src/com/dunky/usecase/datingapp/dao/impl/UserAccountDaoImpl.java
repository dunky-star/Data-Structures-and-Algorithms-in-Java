package com.dunky.usecase.datingapp.dao.impl;

import com.dunky.usecase.datingapp.dao.UserAccountDao;
import com.dunky.usecase.datingapp.entity.UserAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserAccountDaoImpl implements UserAccountDao {
    // In memory storage
    private final TreeMap<Integer, UserAccount> userAccountDB = new TreeMap<Integer, UserAccount>();

    @Override
    public void save(UserAccount userAccount) {
      userAccountDB.put(userAccount.getId(), userAccount);
    }

    @Override
    public List<UserAccount> findAll() {
        ArrayList<UserAccount> account = new ArrayList<UserAccount>();
        for(Map.Entry<Integer, UserAccount> entry : userAccountDB.entrySet()){
            account.add(entry.getValue());
            System.out.println();
        }

        return account;
    }

    @Override
    public List<UserAccount> findMatches(int age, String city) {
        ArrayList<UserAccount> account = new ArrayList<>();
        for(Map.Entry<Integer, UserAccount> entry : userAccountDB.entrySet()){
            if(entry.getValue().getAge() == age && entry.getValue().getCity().equals(city)){
                account.add(entry.getValue());
            }
        }
        return account;
    }

    @Override
    public void delete(int id) {
      userAccountDB.remove(id);
    }
}
