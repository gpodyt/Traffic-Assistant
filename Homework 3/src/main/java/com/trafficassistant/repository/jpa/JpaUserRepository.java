package com.trafficassistant.repository.jpa;

import com.trafficassistant.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<User, String>
{
    User getByUsernameAndPassword(String username, String password);
    User getByEmailAndPassword(String email, String password);
    User getByUsername(String username);
}
