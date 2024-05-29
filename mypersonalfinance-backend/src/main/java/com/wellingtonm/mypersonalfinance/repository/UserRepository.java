package com.wellingtonm.mypersonalfinance.repository;

import com.wellingtonm.mypersonalfinance.modules.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
