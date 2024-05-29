package com.wellingtonm.mypersonalfinance.repository;

import com.wellingtonm.mypersonalfinance.modules.entity.Launch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaunchRepository extends JpaRepository<Launch, Long> {
}
