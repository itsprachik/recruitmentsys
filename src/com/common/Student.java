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
public class Student implements Serializable{
    
    private String FirstName;
    private String LastName;
    private long PhoneNo;
    private int StudID;
    private String DOB;
    private String Gender;
    private double GPA;
    private String LanguagesKnown;
    private String Qualification;
    private String TechnicalSkills;
    private String WorkExperience;
    private double AptitudeTest;
    private String ProjectTitle;
    private String ProjectDetails;
    private String S_Email;
    private String S_Password;
    
   public Student(String FirstName, String LastName, long PhoneNo, int StudID,
String DOB, String Gender, double GPA, String LanguagesKnown, String Qualification,
String TechnicalSkills, String WorkExperience, double AptitudeTest, String ProjectTitle,
String ProjectDetails, String S_Email, String S_Password){
       this.FirstName=FirstName;
       this.LastName=LastName;
       this.PhoneNo=PhoneNo;
       this.StudID=StudID;
       this.DOB=DOB;
       this.Gender=Gender;
       this.LanguagesKnown=LanguagesKnown;
       this.GPA=GPA;
       this.Qualification=Qualification;
       this.TechnicalSkills=TechnicalSkills;
       this.WorkExperience=WorkExperience;
       this.AptitudeTest=AptitudeTest;
       this.ProjectTitle=ProjectTitle;
       this.ProjectDetails=ProjectDetails;
       this.S_Email=S_Email;
       this.S_Password=S_Password;
   }
    
    
}

