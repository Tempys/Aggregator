package com.dubovskiy.coreoracle.entity;

import javax.persistence.Embeddable;
import java.util.Date;

/**
 * Created by Misha on 20.07.2015.
 */
@Embeddable
public class JobHistoryPk {

    private Integer employeeId;
    private Date startDate;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
