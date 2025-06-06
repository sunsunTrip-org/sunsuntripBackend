package com.sunsuntrip.backend.repository;

import com.sunsuntrip.backend.domain.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long> {
    // findAll() 메서드는 자동 제공됨
    Optional<Theme> findByName(String name);
}
