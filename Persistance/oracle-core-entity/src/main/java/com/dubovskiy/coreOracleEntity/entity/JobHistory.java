package com.dubovskiy.coreOracleEntity.entity;

import javax.persistence.*;

/**
 * Created by Misha on 19.07.2015.
 */
@Entity(name = "JOB_HISTORY")
@IdClass(JobHistoryPk.class)
public class JobHistory {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "employeeId", column = @Column(name = "EMPLOYEE_ID", nullable = false, precision = 6, scale = 0)),
            @AttributeOverride(name = "startDate", column = @Column(name = "START_DATE", nullable = false, columnDefinition = "TIMESTAMP"))})
    private JobHistoryPk jobHistoryPk;


}
