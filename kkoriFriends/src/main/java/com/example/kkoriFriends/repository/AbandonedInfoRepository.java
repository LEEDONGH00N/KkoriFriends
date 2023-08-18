package com.example.kkoriFriends.repository;

import com.example.kkoriFriends.entity.Abandoned;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbandonedInfoRepository extends JpaRepository<Abandoned, Long> {
    Page<Abandoned> findAll(Pageable pageable);
}
