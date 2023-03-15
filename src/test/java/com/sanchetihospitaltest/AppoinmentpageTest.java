package com.sanchetihospitaltest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sanchetibase.SachetiBase;
import com.sanchetihospitalpages.Sanchetihospitalpage;

public class AppoinmentpageTest extends SachetiBase {
	//@BeforeClass
	//public void loadpage(){
	Sanchetihospitalpage objapp;
	
	
	@Test
	public void appoinmentPage() throws IOException{
		objapp= new Sanchetihospitalpage(driver);
		
		objapp.bookappointmentbutton.click();
		
		getscreenshot("AppoinmentPage");
		
	}
	
	@Test
	public void purposeDr(){
		Select purpose = new Select(objapp.purposeopdropdown);
		purpose.selectByVisibleText("General Consultation");	
	}
	@Test
	public void selectDate() throws InterruptedException
	{
		objapp.visitClinicbutton.click();
		//objapp.videoConsultationbttton.click();
		objapp.dateselection.clear();
		objapp.selecteddate.click();

		objapp.dateselection.sendKeys("28022023");
		objapp.dateselection.sendKeys(Keys.TAB);
		//Thread.sleep(2000);
		objapp.morningOption.click();
		
	}
	@Test
	public void patientDetail()
	{
		//objapp.visitornameTextbox.click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='common-form-style patient-name']"))).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='common-form-style patient-name']"))).click();
	if(	driver.findElement(By.xpath("//input[@class='common-form-style patient-name']")).isDisplayed())
	{
		
		driver.findElement(By.xpath("//input[@class='common-form-style patient-name']")).click();
		//input[@class	common-form-style patient-name
		driver.findElement(By.xpath("//input[@class='common-form-style patient-name']")).sendKeys("testing it ");
		//objapp.visitornameTextbox.sendKeys("test");
	}	
		
	}
	}	
	


