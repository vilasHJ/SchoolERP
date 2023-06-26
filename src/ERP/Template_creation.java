package ERP;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Template_creation extends Student_Admission {
	
	public static void TimeTable_Creation() throws InterruptedException {
		Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-home/div[2]/div/div[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-sub-modules/div[2]/div/div[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-view-options/div[2]/div/div[1]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-timetable-template/div/div/div/form/div[1]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"schoolStartTime\"]")).sendKeys("0900AM");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"schoolEndTime\"]")).sendKeys("0400PM");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"nameOfTemplate\"]")).sendKeys("Sri Time Table");
	Thread.sleep(2000);
	JavascriptExecutor jse4 = (JavascriptExecutor)driver;
	jse4.executeScript("window.scrollBy(0,600)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-timetable-template/div/div/div/form/div[2]/div/div[3]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-timetable-template/div/div/div/form/div[2]/div/div[1]/div[3]/div/div/button")).click();
	Select SourceTemplate = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div[1]/div/div/div[1]/div/div/div/select")));
	SourceTemplate.selectByVisibleText("Sri Time Table");
	Thread.sleep(2000);
	Select CourceSelect = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div[1]/div/div/div[2]/div/div/div/select")));
	CourceSelect.selectByVisibleText("CBSE - Class 1 - A - 2023 ");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[2]/button")).click();
	Thread.sleep(4000);
//	Thread.sleep(6000);
//	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-timetable-template/div/div/div/form/div[2]/div/div[3]/button")).click();
//	Thread.sleep(4000);
//	JavascriptExecutor jse6 = (JavascriptExecutor)driver;
//	jse6.executeScript("window.scrollBy(0,-600)");
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-timetable-template/ol/li[4]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-view-options/div[2]/div/div[2]/div")).click();
	Thread.sleep(3000);
	Select SelectGrade = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[1]/div[1]/div/div/select")));
	SelectGrade.selectByVisibleText("CBSE - Class 1 - A - 2023 ");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[2]/div/div/table/tr[1]/td[1]/div")).click();
	Thread.sleep(2000);
	Select Class1 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[3]/div/div/div/select")));
	Class1.selectByVisibleText("Physics");
	Thread.sleep(1000);
	Select Teacher1 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[4]/div/div/div/select")));
	Teacher1.selectByVisibleText("Sri001_Anitha Kumari ");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[2]/div/div/table/tr[1]/td[2]")).click();
	Select Class2 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[3]/div/div/div/select")));
	Class2.selectByVisibleText("Paper Craft");
	Thread.sleep(1000);
	Select Teacher2 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[4]/div/div/div/select")));
	Teacher2.selectByVisibleText("Sri001_Anitha Kumari ");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[2]/div/div/table/tr[1]/td[4]")).click();
	Select Class3 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[3]/div/div/div/select")));
	Class3.selectByVisibleText("Physics");
	Thread.sleep(1000);
	Select Teacher3 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[4]/div/div/div/select")));
	Teacher3.selectByVisibleText("Sri001_Anitha Kumari ");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[2]/div/div/table/tr[1]/td[5]")).click();
	Select Class4 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[3]/div/div/div/select")));
	Class4.selectByVisibleText("Paper Craft");
	Thread.sleep(1000);
	Select Teacher4 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[4]/div/div/div/select")));
	Teacher4.selectByVisibleText("Sri001_Anitha Kumari ");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[2]/div/div/table/tr[1]/td[7]")).click();
	Select Class5 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[3]/div/div/div/select")));
	Class5.selectByVisibleText("Physics");
	Thread.sleep(1000);
	Select Teacher5 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[4]/div/div/div/select")));
	Teacher5.selectByVisibleText("Sri001_Anitha Kumari ");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[2]/div/div/table/tr[1]/td[8]/div")).click();
	Select Class6 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[3]/div/div/div/select")));
	Class6.selectByVisibleText("Paper Craft");
	Thread.sleep(1000);
	Select Teacher6 = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div[4]/div/div/div/select")));
	Teacher6.selectByVisibleText("Sri001_Anitha Kumari ");
	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[2]/button")).click();
	Thread.sleep(3000);
	JavascriptExecutor jse5 = (JavascriptExecutor)driver;
	jse5.executeScript("window.scrollBy(0,800)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[2]/div[2]/button")).click();
	Thread.sleep(2000);
	JavascriptExecutor jse6 = (JavascriptExecutor)driver;
	jse6.executeScript("window.scrollBy(0,-800)");
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/ol/li[4]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-view-options/div[2]/div/div[3]/div")).click();
	Thread.sleep(2000);
	Select GradeSelection = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[1]/div[1]/div/div/select")));
	GradeSelection.selectByVisibleText("CBSE - Class 1 - A - 2023 ");
	Thread.sleep(4000);
	JavascriptExecutor jse7 = (JavascriptExecutor)driver;
	jse7.executeScript("window.scrollBy(0,200)");
	Thread.sleep(2000);
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 try {
           FileUtils.copyFile(screenshot, new File("C:\\Users\\VILAS HJ\\eclipse-workspace\\School_ERP\\Screenshot\\TimetableScreenshot.png"));
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
	 Thread.sleep(2000);
		JavascriptExecutor jse8 = (JavascriptExecutor)driver;
		jse7.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/ol/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-view-options/div[2]/div/div[4]")).click();
		Thread.sleep(2000);
		Select SelectTeacher = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div/div[1]/div/div/select")));
		SelectTeacher.selectByVisibleText("Sri001_Anitha Kumari ");
		Select SelectYear = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/div/div/div/form/div/div/div[1]/div[2]/div/div/select")));
		SelectYear.selectByVisibleText("2023 ");
		Thread.sleep(4000);
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 try {
	           FileUtils.copyFile(screenshot1, new File("C:\\Users\\VILAS HJ\\eclipse-workspace\\School_ERP\\Screenshot\\TeacherTimetableScreenshot.png"));
	       } catch (IOException e) {
	           System.out.println(e.getMessage());
	       }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-class-timetable/ol/li[3]/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-sub-modules/div[2]/div/div[5]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-attendance/div/form[1]/div/div[1]/div/div/div/input")).clear();
		 driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-attendance/div/form[1]/div/div[1]/div/div/div/input")).sendKeys("16012023");
		 
		 Select Grade = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-attendance/div/form[1]/div/div[2]/div/div/select")));
			Grade.selectByVisibleText(" CBSE - Class 1 - A ");
			Thread.sleep(1000);
			Select Subject = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-attendance/div/form[1]/div/div[3]/select")));
			Subject.selectByVisibleText(" Physics _ 09:00 - 10:00 ");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-attendance/div/form[2]/div/mat-table/mat-row/mat-cell[4]/button[1]")).click();
			driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-attendance/div/form[2]/div/div/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-student-attendance/div/form[1]/div/div[6]/u/a/b")).click();
			Thread.sleep(2000);
			Select Grade1 = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-attendance-report/div[1]/form/div/div[1]/div/div/select")));
			Grade1.selectByVisibleText(" CBSE - Class 1 - A ");
			Select Year = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-attendance-report/div[1]/form/div/div[2]/div/div/select")));
			Year.selectByVisibleText(" 2023 ");
			Select ReportType = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-attendance-report/div[1]/form/div/div[3]/div/div/select")));
			ReportType.selectByVisibleText(" DAY ");
			Select StartMonth = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-attendance-report/div[1]/form/div/div[4]/div/div/select")));
			StartMonth.selectByVisibleText(" January ");
			Select EndMonth = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-attendance-report/div[1]/form/div/div[5]/div/div/select")));
			EndMonth.selectByVisibleText(" January ");
			Thread.sleep(1000);
			Select Subject1 = new Select(driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-attendance-report/div[1]/form/div/div[6]/div/div/select")));
			Subject1.selectByVisibleText(" Physics _ 09:00 - 10:00 ");
			Thread.sleep(5000);
			File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			 try {
		           FileUtils.copyFile(screenshot2, new File("C:\\Users\\VILAS HJ\\eclipse-workspace\\School_ERP\\Screenshot\\AttendanceReportScreenshot.png"));
		       } catch (IOException e) {
		           System.out.println(e.getMessage());
		       }
	
			driver.findElement(By.xpath("/html/body/app-dashboard/div/main/app-attendance-report/ol/li[1]/a")).click();
			Thread.sleep(3000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
