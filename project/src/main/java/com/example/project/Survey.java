package com.example.project;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private Long id;
    private String surveyname;
    private String surveytype;
    private String startdate;
    private String enddate;
    private String surveydescription;

    protected Survey() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Survey(String surveyname, String surveytype, String startdate, String enddate) {
        this.surveyname = surveyname;
        this.surveytype = surveytype;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Survey(String surveydescription) {
        this.surveydescription = surveydescription;
    }

    public Survey(Long id) {
        this.id = id;
    }

    public String getSurveyname() {
        return surveyname;
    }

    public void setSurveyname(String surveyname) {
        this.surveyname = surveyname;
    }

    public String getSurveytype() {
        return surveytype;
    }

    public void setSurveytype(String surveytype) {
        this.surveytype = surveytype;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getSurveydescription() {
        return surveydescription;
    }

    public void setSurveydescription(String surveydescription) {
        this.surveydescription = surveydescription;
    }
}
