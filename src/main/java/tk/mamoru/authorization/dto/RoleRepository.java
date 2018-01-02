package tk.mamoru.authorization.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * user: alekseyb
 * date: 1/2/18
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);

}