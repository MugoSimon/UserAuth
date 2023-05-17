package com.UserAuth.Repository;

import com.UserAuth.Model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<UserDetails, Integer> {
    //TODO some method will be coming.
    public boolean existsByEmail(String email);
}
