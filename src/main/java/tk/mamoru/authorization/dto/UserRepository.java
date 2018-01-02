package tk.mamoru.authorization.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * user: alekseyb
 * date: 1/2/18
 */
//@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long>{
    public User findByEmail(String email);
}
