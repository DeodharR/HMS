package com.sanchetihospitalpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sanchetihospitalpage {
	WebDriver driver;
	
	public Sanchetihospitalpage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//@FindBy(xpath="//a[text()='Appointment']")
	@FindBy(xpath="//a[text()='Book Appointment']")
	@CacheLookup
	public WebElement bookappointmentbutton;
	
	@FindBy(xpath="//select[@id='services']")
	public WebElement purposeopdropdown;
	
	@FindBy(xpath="//select[@id='doctorsForService']")
	public WebElement selectdoctordropdown;
	
	@FindBy(xpath="//input[@value='visitClinic']")
	public WebElement visitClinicbutton;
	
	@FindBy(xpath="//input[@value='videoConsultation']")
	public WebElement videoConsultationbttton;
	
	@FindBy(xpath="//input[@id='datepickerinput']")
	public WebElement dateselection;
	
	@FindBy(xpath="//td[text()='28']")
	public WebElement selecteddate;
	
	@FindBy(xpath="//span[text()='11:30 AM']")
	public WebElement morningOption;
	
	//@FindBy(xpath="//input[@class='common-form-style patient-name']")
	@FindBy(xpath="//input[@class='common-form-style patient-name']")
	public WebElement visitornameTextbox;
	
	
		
}
