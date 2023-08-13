package com.example.kkoriFriends.repository;

import com.example.kkoriFriends.entity.Abandoned;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbandonedInfoRepository extends JpaRepository<Abandoned, Long> {
}
