package com.dubovskiy.coreOracleEntity.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Misha on 19.07.2015.
 */
@Entity(name = "JOB_HISTORY")
public class JobHistory {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "employeeId", column = @Column(name = "EMPLOYEE_ID", nullable = false, precision = 6, scale = 0)),
            @AttributeOverride(name = "startDate", column = @Column(name = "START_DATE", nullable = false, columnDefinition = "TIMESTAMP"))})
    private JobHistoryPk jobHistoryPk;
    private Timestamp endDate;

    public JobHistoryPk getJobHistoryPk() {
        return jobHistoryPk;
    }

    public void setJobHistoryPk(JobHistoryPk jobHistoryPk) {
        this.jobHistoryPk = jobHistoryPk;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }
}
