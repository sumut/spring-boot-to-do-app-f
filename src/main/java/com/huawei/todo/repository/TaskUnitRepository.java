package com.huawei.todo.repository;

import com.huawei.todo.entity.TaskUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author sumutella
 * @time 5:39 PM
 * @since 12/15/2019, Sun
 */
public interface TaskUnitRepository extends JpaRepository<TaskUnit, Integer> {
    List<TaskUnit> findByTaskId(Integer taskId);
    List<TaskUnit> findByStatusIgnoreCase(String status);
    List<TaskUnit> findAllByOrderByCreatedDate();
    List<TaskUnit> findAllByOrderByDeadline();
    List<TaskUnit> findAllByOrderByName();
    List<TaskUnit> findAllByOrderByStatus();



}
