package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;

public class IoTest1 {

	public static void readCsvFile(String filePath) {
		
		try {
			ArrayList<String[]> csvList = new ArrayList<String[]>(); // 用来保存数据
			// 一般用这编码读就可以了
			CsvReader reader = new CsvReader(filePath, ',',
					Charset.forName("SJIS"));
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			reader.readHeaders(); // 跳过表头如果需要表头的话，不要写这句。
			br.readLine();
			String line;
			while ((line=br.readLine())!=null) { // 逐行读入除表头的数据
				String files []= line.split(", ");
				csvList.add(files);
			}
			br.close();
			for (int row = 0; row < csvList.size(); row++) {
				System.out.println(csvList.get(row)[0]); // name
				System.out.println(csvList.get(row)[1]); // email
				/*System.out.println(csvList.get(row)[2]); // age
				System.out.println(csvList.get(row)[3]); // sex
*/				
				System.out.println("------------"); // 分割线
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		String filePath = "F:\\selenium\\Test2.csv";
		readCsvFile(filePath);
	}

}
