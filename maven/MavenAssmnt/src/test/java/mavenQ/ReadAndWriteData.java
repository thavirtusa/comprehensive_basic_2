package mavenQ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteData {
	public static void main(String[] args) throws IOException {
		File excelFile = new File("data.xlsx");
		FileInputStream file = new FileInputStream(excelFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next();
		
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			String name = row.getCell(0).getStringCellValue();
			String course = row.getCell(1).getStringCellValue();
			double fee = row.getCell(2).getNumericCellValue();
			Student student = new Student(name, course, fee);
		}
		
		file.close();
		
		for(Student student : studentList) {
			System.out.println(student);
		}
	}
}

