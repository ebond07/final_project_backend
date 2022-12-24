package com.example.jpahello.repository;

import com.example.jpahello.entity.Week;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeekRepository extends CrudRepository<Week, Long> {
    public List<Week> findAllByWeekOfMonth(int weekOfMonth);
}
