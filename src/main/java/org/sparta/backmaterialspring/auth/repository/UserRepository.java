package org.sparta.backmaterialspring.auth.repository;

import org.sparta.backmaterialspring.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
