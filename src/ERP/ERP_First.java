package ERP;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ERP_First {
	public static WebDriver driver;
	public static void CreateInstance()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
		 driver = new ChromeDriver();	
		 driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
	}
	public static String getCellVal(XSSFSheet SheetName,int i,int j) {
		XSSFCell row = SheetName.getRow(i).getCell(j);
        return row.toString();		
	}
	public static void LoginPage()
	{

		driver.get("http://additerpforschool.azurewebsites.net/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vilas@additlabs.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Vilas147@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	public static void Delay() throws InterruptedException
	{
		Thread.sleep(15000);
	}
	public static void School_Creation(XSSFSheet SheetName) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='btn btn-primary ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='schoolname']")).sendKeys(getCellVal(SheetName,1,0));
		driver.findElement(By.xpath("//input[@formcontrolname='alias']")).sendKeys(getCellVal(SheetName,1,1));
		driver.findElement(By.xpath("//input[@formcontrolname='country']")).sendKeys(getCellVal(SheetName,1,2));
		driver.findElement(By.xpath("//input[@formcontrolname='state']")).sendKeys(getCellVal(SheetName,1,3));
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys(getCellVal(SheetName,1,4));
		driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys(getCellVal(SheetName,1,5));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
	}
	public static  XSSFSheet Data_Provider() throws IOException 
	{
		File file =    new File("C:\\Users\\vilas\\eclipse-workspace\\ERP_Project\\ERP.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(inputStream);
			 XSSFSheet sheet=wb.getSheet("Sheet1");
			 XSSFRow roww = sheet.getRow(0);
			 int cellcount= roww.getPhysicalNumberOfCells();
			 int rowCount=sheet.getLastRowNum()+1;
				System.out.println(rowCount);
				System.out.println(cellcount);
				return sheet;
				
	}
	
				

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
