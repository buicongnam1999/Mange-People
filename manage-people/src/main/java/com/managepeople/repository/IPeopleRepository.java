package com.managepeople.repository;

import com.managepeople.models.People;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPeopleRepository extends JpaRepository<People, Long> {
    List<People> findAll(Sort sort);
    Page<People> findAll(Pageable pageable);
    List<People> findAllByStatusIsTrue();
}
