package ERP;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class Student_Admission extends Fee_Details {
	public static void Student_Admission() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-sub-modules/div[2]/div/div[2]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='Firstname']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='Lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='Admission_No']")).sendKeys("SRI001");
		driver.findElement(By.xpath("//input[@id='Roll_Number']")).sendKeys("CBSECL1001");
		Select Cource = new Select(driver.findElement(By.xpath("//*[@id=\"courseSection\"]")));
		Cource.selectByVisibleText("CBSE - Class 1 - A");
		Select AcademicYear = new Select(driver.findElement(By.xpath("//*[@id=\"academicYear\"]")));
		AcademicYear.selectByVisibleText("2023");
		driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div[1]/div[7]/div/ng-multiselect-dropdown/div/div[1]/span/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-admission/div/div/mat-tab-group/div/mat-tab-body[1]/div/div[1]/div[7]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")).click();
		driver.findElement(By.xpath("//input[@id='Admission_Date']")).click();
		driver.findElement(By.xpath("//input[@id='Admission_Date']")).sendKeys("01/01/2023");
		driver.findElement(By.xpath("//input[@id='Photo']")).sendKeys("C:\\Users\\VILAS HJ\\Downloads\\Ram.jpg");
		driver.findElement(By.xpath("//input[@id='MobileNumber']")).sendKeys("8310325883");
		driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]/div")).click();
		Thread.sleep(2000);
		Select Gender = new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
		Gender.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@id='DOB']")).sendKeys("01/04/1997");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Ram@gmail.com");
		Select Category = new Select(driver.findElement(By.xpath("//*[@id=\"category\"]")));
		Category.selectByVisibleText("OBC");
		driver.findElement(By.xpath("//input[@id='Religion']")).sendKeys("Hindhu");
		driver.findElement(By.xpath("//input[@id='Caste']")).sendKeys("Kshatriya");
		Select BloodGroup = new Select(driver.findElement(By.xpath("//*[@id=\"bloodGroup\"]")));
		BloodGroup.selectByVisibleText("O+");
		driver.findElement(By.xpath("//input[@id='Mother-tongue']")).sendKeys("Kannada");
		driver.findElement(By.xpath("//input[@id='National_idNo']")).sendKeys("123456789013");
		Select RTE = new Select(driver.findElement(By.xpath("//*[@id=\"rte\"]")));
		RTE.selectByVisibleText("No");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Current_address\"]")).sendKeys("Vaishnavi PG, Jaynagar 4th block, Banglore, 560011");
		driver.findElement(By.xpath("//*[@id=\"Permanent_address\"]")).sendKeys("Humcha, Hosanagar, Shivamogga, 577436");
		driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-2\"]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Father_Name']")).sendKeys("Dashrata");
		driver.findElement(By.xpath("//input[@id='Father_PhoneNo']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='Father_Occupation']")).sendKeys("Farmer");
		driver.findElement(By.xpath("//input[@id='Father_Photo']")).sendKeys("C:\\Users\\VILAS HJ\\Downloads\\Ram.jpg");
		driver.findElement(By.xpath("//input[@id='Mother_Name']")).sendKeys("Kousalya");
		driver.findElement(By.xpath("//input[@id='Mother_Phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='Mother_Occupation']")).sendKeys("House Wife");
		driver.findElement(By.xpath("//input[@id='Mother_Photo']")).sendKeys("C:\\Users\\VILAS HJ\\Downloads\\Ram.jpg");
		Select Guardian = new Select(driver.findElement(By.xpath("//*[@id=\"guardian\"]")));
		Guardian.selectByVisibleText("Father");
		driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-3\"]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"discountid\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Scholardiscount\"]")).click();
		Select DiscountSelection = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div[2]/div/div/form/select")));
		DiscountSelection.selectByVisibleText("Sports");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div[2]/button")).click();
		///html/body/ngb-modal-window/div/div/div[2]/div[2]/button
		Thread.sleep(3000);
		Select Instalment = new Select(driver.findElement(By.xpath("//*[@id=\"installment\"]/div/div/select")));
		Instalment.selectByVisibleText("No");
		driver.findElement(By.xpath("//input[@placeholder='Paid']")).sendKeys("14400");
		driver.findElement(By.xpath("//input[@placeholder='Date']")).sendKeys("17-01-2023");
		driver.findElement(By.xpath("//input[@placeholder='Payment Id']")).sendKeys("12345");	
		Select ModeOfPayment = new Select(driver.findElement(By.xpath("//*[@id=\"modeOfPayment\"]/div/div/select")));
		ModeOfPayment.selectByVisibleText("Cash");
		driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-4\"]/div")).click();
		driver.findElement(By.xpath("//input[@placeholder='Previous School Name']")).sendKeys("Kumadvathi School");
		driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-4\"]/div/div[1]/div[2]/div/div/textarea")).sendKeys("Kumadvathi school, Gartikere, hosanagar");
		driver.findElement(By.xpath("//input[@id='Transfer_Certificate']")).sendKeys("C:\\Users\\VILAS HJ\\Downloads\\TransferCertificate.jpeg");
		driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-5\"]/div")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,3500)");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-admission/div/div/mat-tab-group/div/mat-tab-body[6]/div/section/div/div[3]/button")).click();
		 Thread.sleep(15000);
		 JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			jse3.executeScript("window.scrollBy(0,-3500)");
			Thread.sleep(2000);
			///html/body/app-dashboard/div/main/app-student-admission/ol/li[2]/a
		//	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-admission/ol/li[3]/a")).click();
			driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-admission/ol/li[2]/a")).click();
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
