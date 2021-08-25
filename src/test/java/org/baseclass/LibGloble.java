package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGloble {
	
	
protected static WebDriver driver;
 static Actions a;
static JavascriptExecutor js=(JavascriptExecutor) driver;
public static void browserConfig() {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\eclipse-workspace\\newmav\\driver\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}


public static void openUrl(String url) {
	driver.get(url);	
}

public static void maximizeWindow() {
	driver.manage().window().maximize();
}
public static void type(WebElement element,String data) {
	element.sendKeys(data);	
}
public static void click(WebElement element) {
	element.click();
	}
public String getText(WebElement element) {
	
 String text = element.getText();
 return text;
}

public static void navigateTo(String URL) {
	driver.navigate().to(URL);
}

public static void backPage() {
	driver.navigate().back();;
}

public static void forwordpage() {
	driver.navigate().forward();
}

public static void refresh() {
	driver.navigate().refresh();
}

//public void getAttributevalue(WebElement ele) {
//	ele.getAttribute("value");
//
//}
public static void simpleAlert() {
	Alert al=driver.switchTo().alert();
	al.accept();
}

public static void moveToElement(WebElement src) {
	a=new Actions(driver);
a.moveToElement(src).perform();
}

public static void dragAndDrop( WebElement source, WebElement target) {
	a=new Actions(driver);
a.dragAndDrop(source, target).perform();
}

public static void rightClick(WebElement target) {
	a=new Actions(driver);
a.contextClick(target).perform();
} 

public static void doubleClick(WebElement target) {
	a=new Actions(driver);
a.doubleClick(target).perform();
}

public static void scrollUp(WebElement arg1) {
	
js.executeScript("argument[0].scrollIntoView(false)", arg1);
}

public static void scrollDown(WebElement arg1) {
	
js.executeScript("argument[0].scrollIntoView(true)", arg1);
}

public static String excelRead(String location, String sheet, int row, int cell) throws IOException {
	
	File f=new File(location);
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s=w.getSheet(sheet);
	Row r=s.getRow(row);
	Cell c=r.getCell(cell);
	String value="";
	int celltype=c.getCellType();
	
	if(celltype==1) {
		
		value=c.getStringCellValue();
		
	}
	else if (celltype==0) {
		if (DateUtil.isCellDateFormatted(c)) {
			  java.util.Date dateCellValue = c.getDateCellValue();
			  SimpleDateFormat sim=new SimpleDateFormat("MM/dd/yyyy");
			  value=sim.format(dateCellValue);
		
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			long l=(long) numericCellValue;
			value= String.valueOf(l);
		}
		
	}
	
	return value;
	
	}

public static void excelWrite(String pathname, String sheet, int row, int cell, String name) throws IOException {
	File f=new File(pathname);
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new  XSSFWorkbook(fin);
	Sheet createSheet = w.createSheet(sheet);
	Row r=createSheet.createRow(row);
	Cell c=r.createCell(cell);
	c.setCellValue(name);
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	
  }

public void selectByVisibleText(WebElement element, String data) {
	Select s=new Select(element);
	s.selectByVisibleText(data);
	
}
	
	
	
	
}
