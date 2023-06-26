package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Staff_Registration extends ERP_First {
	public static void Staff_Creation() throws InterruptedException
	{
		//Thread.sleep(10000);
		// driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-subscribed-page/div/div[2]/div/div/div")).click();
		 //html/body/app-dashboard/div/main/app-home/div[2]/div/div[2]/div/div[1]
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-home/div[2]/div/div[2]/div/div[1]/div")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-sub-modules/div[2]/div/div[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-organizational-structure/div/div[2]/div/div/div[1]/div/div/div")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='departments']")).sendKeys("Sports");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='Save']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='departments']")).sendKeys("Academics");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='Save']")).click();
		 Thread.sleep(2000);
	}
	public static void Staff_Details() throws InterruptedException {
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-organization/ol/li[4]/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-organizational-structure/div/div[2]/div/div/div[2]/div/div/div")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("Teacher");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='Save']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("Head Master");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='Save']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-organization/ol/li[3]/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-sub-modules/div[2]/div/div[2]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='Staff_Id']")).sendKeys("SRI001");
		 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Anitha");
		 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kumari");
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/div/div/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[4]/div/div/select")).sendKeys("Teacher");
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/div/div/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[5]/div/div/select")).sendKeys("Teacher");
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/div/div/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[6]/div/div/select")).sendKeys("Academics");
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Anitha@gmail.com");
		 driver.findElement(By.xpath("//input[@id='MobileNumber']")).sendKeys("9834567890");
		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Anitha@147");
		 driver.findElement(By.xpath("//input[@id='Date_Of_Birth']")).sendKeys("01/01/1990");
		 driver.findElement(By.xpath("//input[@id='Date_Of_Joining']")).sendKeys("01/01/2018");
		 driver.findElement(By.xpath("//input[@id='Photo']")).sendKeys("C:\\Users\\VILAS HJ\\Downloads\\Anitha.png");
		 driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div[1]/div[13]/div/div/ng-multiselect-dropdown/div/div[1]/span")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div[1]/div[13]/div/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li/div")).click();
		// driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/div/div/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[13]/div/div/ng-multiselect-dropdown/div/div[1]/span")).sendKeys("Maths");
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='FatherName']")).sendKeys("Raja");
		 driver.findElement(By.xpath("//input[@id='MotherName']")).sendKeys("Rani");
		 driver.findElement(By.xpath("//input[@id='Emergency_Contact_Number']")).sendKeys("9876543210");
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div[1]/div[2]/div[4]/div/div/select")).sendKeys("Female");
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div[1]/div[2]/div[5]/div/div/select")).sendKeys("Married");
		 driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Ujjire,Beltangady,Dakshina Kannada,579800");
		 driver.findElement(By.xpath("//textarea[@placeholder='Permanent Address']")).sendKeys("Ujjire,Beltangady,Dakshina Kannada,579800");
		 driver.findElement(By.xpath("//input[@id='Qualification']")).sendKeys("B.ED");
		 driver.findElement(By.xpath("//input[@id='WorkExperience']")).sendKeys("2");
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,600)");
			Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='PAN_Number']")).sendKeys("BQ12345678");
		 driver.findElement(By.xpath("//input[@id='EPF_No']")).sendKeys("123456789007dgs");
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div[2]/div[2]/div[3]/div/div/select")).sendKeys("Permanent");
		 driver.findElement(By.xpath("//input[@id='Medical_Leave']")).sendKeys("05");
		 driver.findElement(By.xpath("//input[@id='Casual_Leave']")).sendKeys("12");
		 driver.findElement(By.xpath("//input[@id='Maternity_Leave']")).sendKeys("90");
		 driver.findElement(By.xpath("//input[@id='Bank_Account_Number']")).sendKeys("CNRB12315000");
		 driver.findElement(By.xpath("//input[@id='Account_HolderName']")).sendKeys("Anitha");
		 driver.findElement(By.xpath("//input[@id='BankName']")).sendKeys("Canara Bank");
		 driver.findElement(By.xpath("//input[@id='IFSC_Code']")).sendKeys("124637383939");
		 driver.findElement(By.xpath("//input[@id='Bank_Branch_Name']")).sendKeys("Ujire");
		 driver.findElement(By.xpath("//input[@id='Resume']")).sendKeys("C:\\Users\\VILAS HJ\\Downloads\\Anitha_Resume.pdf");
		 driver.findElement(By.xpath("//input[@id='Joining_Letter']")).sendKeys("C:\\Users\\VILAS HJ\\Downloads\\Anitha_JoiningLetter.jpg");
		 driver.findElement(By.xpath("//input[@id='Id_Proof']")).sendKeys("C:\\Users\\VILAS HJ\\Downloads\\Anitha_IDProof.jpg");
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div[5]/button")).click();
		Thread.sleep(5000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mat-tab-label-0-0\"]/div")).click();
		Thread.sleep(2000);
		///html/body/app-dashboard/div/main/app-student-admission/ol/li[2]/a
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-staff-registration/ol/li[2]/a")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
