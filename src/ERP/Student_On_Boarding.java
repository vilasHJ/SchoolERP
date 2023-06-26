package ERP;

import org.openqa.selenium.By;

public class Student_On_Boarding extends Staff_Registration{
	public static void Academic_Structure() throws InterruptedException {
		Thread.sleep(10000);
		///html/body/app-dashboard/div/main/app-subscribed-page/div/div[2]/div/div[1]
		//html/body/app-dashboard/div/main/app-subscribed-page/div/div[2]/div/div[2]
		//html/body/app-dashboard/div/main/app-subscribed-page/div/div[2]/div/div[2]
	//	int j=i+1;
	    driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-subscribed-page/div/div[2]/div/div[1]")).click();
		 Thread.sleep(3000);
		 //html/body/app-dashboard/div/main/app-home/div[2]/div/div[1]/div
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-home/div[2]/div/div[1]/div/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-sub-modules/div[2]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-mastertable/div/div[2]/div/div/div[1]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Stream']")).sendKeys("State");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Stream']")).sendKeys("CBSE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/ol/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-mastertable/div/div[2]/div/div/div[2]/div/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='course']")).sendKeys("Class 1");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='course']")).sendKeys("Class 2");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/ol/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-mastertable/div/div[2]/div/div/div[3]/div/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Section']")).sendKeys("A");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Section']")).sendKeys("B");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/ol/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-mastertable/div/div[2]/div/div/div[4]/div/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/select")).sendKeys("State");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/select")).sendKeys("Class 1");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[5]/div/div/select")).sendKeys("A");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/select")).sendKeys("State");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/select")).sendKeys("Class 1");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[5]/div/div/select")).sendKeys("B");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/select")).sendKeys("State");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/select")).sendKeys("Class 2");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[5]/div/div/select")).sendKeys("A");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/select")).sendKeys("State");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/select")).sendKeys("Class 2");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[5]/div/div/select")).sendKeys("B");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/select")).sendKeys("CBSE");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/select")).sendKeys("Class 1");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[5]/div/div/select")).sendKeys("A");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/select")).sendKeys("CBSE");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/select")).sendKeys("Class 1");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[5]/div/div/select")).sendKeys("B");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/select")).sendKeys("CBSE");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/select")).sendKeys("Class 2");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[5]/div/div/select")).sendKeys("A");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/select")).sendKeys("CBSE");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/select")).sendKeys("Class 2");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[5]/div/div/select")).sendKeys("B");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/ol/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-mastertable/div/div[2]/div/div/div[5]/div/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Academic Year']")).sendKeys("2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/ol/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-mastertable/div/div[2]/div/div/div[6]/div/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Mandatory Subject']")).sendKeys("Kannada");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[2]/div/div/select")).sendKeys("Theory");
		driver.findElement(By.xpath("//input[@placeholder='Subject Code']")).sendKeys("SUB001");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Mandatory Subject']")).sendKeys("Physics");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[2]/div/div/select")).sendKeys("Practical");
		driver.findElement(By.xpath("//input[@placeholder='Subject Code']")).sendKeys("SUB002");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/ol/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-mastertable/div/div[2]/div/div/div[7]/div/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Elective Subject']")).sendKeys("Drawing");
		driver.findElement(By.xpath("//input[@placeholder='Subject Code']")).sendKeys("SUB003");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Elective Subject']")).sendKeys("Paper Craft");
		driver.findElement(By.xpath("//input[@placeholder='Subject Code']")).sendKeys("SUB004");
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/ol/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-mastertable/div/div[2]/div/div/div[8]/div/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[2]/div/div/select")).sendKeys("CBSE-Class 1");
		driver.findElement(By.xpath("//html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/ng-multiselect-dropdown/div/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/div/h2/b")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/ng-multiselect-dropdown/div/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/div/h2/b")).click();
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[2]/div/div/select")).sendKeys("CBSE-Class 1");
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/ng-multiselect-dropdown/div/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[3]/div/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[2]/div")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/div/h2/b")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/ng-multiselect-dropdown/div/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/form/div[1]/div[4]/div/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[2]/div")).click();
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/div/div/div[1]/div/div/h2/b")).click();
		driver.findElement(By.xpath("//button[@id='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-customize-module/ol/li[3]/a")).click();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
