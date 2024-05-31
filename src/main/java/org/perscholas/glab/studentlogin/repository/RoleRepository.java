package org.perscholas.glab.studentlogin.repository;

import org.perscholas.glab.studentlogin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>
{

    Role findByName(String name);
}

