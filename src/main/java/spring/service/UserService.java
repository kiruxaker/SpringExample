package spring.service;

import spring.exception.NoUserFoundException;
import spring.model.User;

public interface UserService {

    User login(User user) throws NoUserFoundException;

    User delete(User user) throws NoUserFoundException;

}
