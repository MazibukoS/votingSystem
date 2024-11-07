package savotingsystem.savotingsystem.service;

import savotingsystem.savotingsystem.model.User;
import savotingsystem.savotingsystem.repository.UserRepository;

public class UserService {

    public void registerUser(User user) {

        try {
            UserRepository.registerUser(user);
        } catch (Exception e) {

        }
    }

    public User getUser(String email, String password) {

        try {
            return UserRepository.getUserForLogin(email, password);
        } catch (Exception e) {
            return null;
        }
    }

}
