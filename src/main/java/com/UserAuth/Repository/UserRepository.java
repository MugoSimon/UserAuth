package com.UserAuth.Repository;

import com.UserAuth.Model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<UserDetails, Long> {
    //some method will be coming.
}
