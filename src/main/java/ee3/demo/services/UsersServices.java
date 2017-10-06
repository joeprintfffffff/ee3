package ee3.demo.services;

import ee3.demo.models.User;

public interface UsersServices extends IBase<User>{
    /**
     * @return all users
     */
    Iterable<User> all();
}
