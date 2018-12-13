package com.teksoi.restapi.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Mozahid on 11/1/17.
 */
@Entity
@Table(name="action_log")
@NamedQuery(name="ActionLog.findAll", query="SELECT u FROM ActionLog u")
public class ActionLog extends BaseModel {

    private String page;

    private Integer scribeUid;

    private String fieldName;

    private String description;

    private String oldValue;

    private String newValue;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="change_date",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date changeDate;

    private Long changedBy;

    public ActionLog(String page, String description, Long changedBy, Date changeDate) {
        this.page = page;
        this.description = description;
        this.changedBy = changedBy;
        this.changeDate = changeDate;
    }
    public ActionLog(String page, String description, Date changeDate) {
        this.page = page;
        this.description = description;
        this.changeDate = changeDate;
    }
}
