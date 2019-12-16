package com.huawei.todo.dto.v1;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author sumutella
 * @time 5:25 PM
 * @since 12/15/2019, Sun
 */
@Setter
@Getter
public class TaskUnitDto {
    private Integer id;
    private String name;
    private Date createdDate = java.sql.Date.valueOf(LocalDate.now());
    private Date deadline;
    private String status;
    private Integer parentTaskUnitId;
    private Integer taskId;

    private TaskUnitDto subTaskUnit;
}
