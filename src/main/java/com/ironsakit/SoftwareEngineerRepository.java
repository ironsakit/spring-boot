package com.ironsakit;

import org.springframework.data.jpa.repository.JpaRepository;

// In JpaRepository you must specify the type of Object and the type of the primary key
public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {
}
