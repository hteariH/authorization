package tk.mamoru.authorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import tk.mamoru.authorization.dto.Role;
import tk.mamoru.authorization.dto.RoleRepository;
import tk.mamoru.authorization.dto.User;
import tk.mamoru.authorization.dto.UserRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * user: alekseyb
 * date: 1/2/18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role admin = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<>(Collections.singletonList(admin)));

        userRepository.save(user);
    }
}
