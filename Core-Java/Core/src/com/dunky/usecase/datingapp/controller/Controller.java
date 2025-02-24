package com.dunky.usecase.datingapp.controller;

import com.dunky.usecase.datingapp.dao.UserAccountDao;
import com.dunky.usecase.datingapp.dao.impl.UserAccountDaoImpl;
import com.dunky.usecase.datingapp.entity.Interest;
import com.dunky.usecase.datingapp.entity.UserAccount;

public class Controller {
    public static void main(String[] args) {
        UserAccountDao dao = new UserAccountDaoImpl();
        UserAccount user1 = new UserAccount();
        user1.setId(1);
        user1.setAge(25);
        user1.setCity("IA");
        user1.setCountry("United States");
        user1.setEmail("dunky@gmail.com");
        user1.setGender("M");
        user1.setPhoneNumber("641-7777");
        user1.setUsername("dunky");
        Interest interest1 = new Interest();
        interest1.setId(1);
        interest1.setLikes("Biking");
        interest1.setDislikes("Mountain climbing");
        interest1.setHobbies("Coding");
        interest1.setAbout("Wealthy for life");
        user1.setInterest(interest1);
        dao.save(user1);

        UserAccount user2 = new UserAccount();
        user2.setId(2);
        user2.setAge(30);
        user2.setCity("FL");
        user2.setCountry("United States");
        user2.setEmail("qwerty@gmail.com");
        user2.setGender("M");
        user2.setPhoneNumber("641-7771");
        user2.setUsername("army");
        Interest interest2 = new Interest();
        interest2.setId(2);
        interest2.setLikes("Motor Racing");
        interest2.setDislikes("Swimming");
        interest2.setHobbies("Reading");
        interest2.setAbout("Chasing dreams");
        user2.setInterest(interest2);
        dao.save(user2);

        // Retrieve all users
        System.out.println(dao.findAll());
    }
}
