package ee3.demo.services.impl;

import ee3.demo.models.User;
import ee3.demo.repositories.mysql.UserRepository;
import ee3.demo.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersServiceImpl implements UsersServices {

    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> all() {
        return userRepository.findAll();
    }

    @Override
    public User first() {
        return userRepository.findAll().iterator().hasNext()?
                userRepository.findAll().iterator().next():null;
    }
}
