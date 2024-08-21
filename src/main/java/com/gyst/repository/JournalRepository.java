package com.gyst.repository;

import com.gyst.entity.JournalEntry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface JournalRepository extends JpaRepository<JournalEntry, Long> {
    Page<JournalEntry> findByCreationDateBetween(LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);
}
