package com.example.project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<Survey, Long> {
}
