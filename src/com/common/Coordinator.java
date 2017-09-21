/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common;

import java.io.Serializable;

/**
 *
 * @author uniqueguppy
 */
public class Coordinator implements Serializable {
    
    private String JobName;
    private double MinGPA;
    private double MinAptitude;
    private String BasicLanguage;
    private String MinTechnicalSkills;
    private String JobDescription;
    private int JobID;
    private String CompanyName;
    private String MinQualitfications;
    private long CompanyPhoneNo;
    private String InterviewDate_Time;
    private String InterviewVenue;
    private String C_Email;
    private String C_Password;
    
    public Coordinator(String JobName,double MinGPA,double MinAptitude,
String BasicLanguage,String MinTechnicalSkills,String JobDescription,
int JobID,String CompanyName,String MinQualitfications,long CompanyPhoneNo,
String InterviewDate_Time,String InterviewVenue, String C_Email, String C_Password)
    {
        this.JobName=JobName;
        this.MinGPA=MinGPA;
        this.MinAptitude=MinAptitude;
        this.BasicLanguage=BasicLanguage;
        this.MinTechnicalSkills=MinTechnicalSkills;
        this.JobDescription=JobDescription;
        this.JobID=JobID;
        this.CompanyName=CompanyName;
        this.MinQualitfications=MinQualitfications;
        this.CompanyPhoneNo=CompanyPhoneNo;
        this.InterviewDate_Time=InterviewDate_Time;
        this.InterviewVenue=InterviewVenue;
        this.C_Email=C_Email;
        this.C_Password=C_Password;
        
    }
    
}
