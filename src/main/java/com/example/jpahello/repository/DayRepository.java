package com.example.jpahello.repository;

import com.example.jpahello.entity.Day;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface DayRepository extends CrudRepository<Day, Long> {
    public List<Day> findAllByWeekId(long week_id);

    @Transactional
    void deleteAllByWeekId(long week_id);
}
