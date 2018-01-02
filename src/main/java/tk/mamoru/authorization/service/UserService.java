package tk.mamoru.authorization.service;

import tk.mamoru.authorization.dto.User;

/**
 * user: alekseyb
 * date: 1/2/18
 */
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
