package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Fee_Details extends Student_On_Boarding {
	public static void Fee_Structure() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-sub-modules/div[2]/div/div[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-fee-structure/div/div[1]/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='feeType']")).sendKeys("Education");
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='feeType']")).sendKeys("Uniform");
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-fee-structure/div/div[1]/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div[1]/div/div[1]/div/div/ng-multiselect-dropdown/div/div[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div[1]/div/div[1]/div/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]/div")).click();
		driver.findElement(By.xpath("//input[@id='discountCategory']")).sendKeys("Sports");
		Select dropdown= new Select( driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div[1]/div/div[4]/div/div/select")));
		dropdown.selectByVisibleText("Total Amount");
		Select discountPercentage= new Select( driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div[1]/div/div[5]/div/div/select")));
		discountPercentage.selectByVisibleText("Percentage");
		driver.findElement(By.xpath("//input[@id='discount']")).sendKeys("10");
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-fee-structure/div/div[2]/div/form/div[1]/div[1]/div/div/select")).sendKeys("CBSE-Class 1");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-fee-structure/div/div[2]/div/form/div[1]/div[2]/div/div/select")).sendKeys("2023");
		driver.findElement(By.xpath("//select[@id='feeType0']")).sendKeys("Education");
		driver.findElement(By.xpath("//input[@id='amount0']")).sendKeys("15000");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-fee-structure/div/div[2]/div/form/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='feeType1']")).sendKeys("Uniform");
		driver.findElement(By.xpath("//input[@id='amount1']")).sendKeys("1000");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-fee-structure/ol/li[3]/a")).click();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
