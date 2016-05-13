package test1;

import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;

public class Test2 {
	public static void readCsvFile(String filePath) {
		try {
			ArrayList<String[]> csvList = new ArrayList<String[]>(); // ������������
			// һ�����������Ϳ�����
			CsvReader reader = new CsvReader(filePath, ',',
					Charset.forName("SJIS"));
			 reader.readHeaders(); // ������ͷ�����Ҫ��ͷ�Ļ�����Ҫд��䡣
			while (reader.readRecord()) { // ���ж������ͷ������
				csvList.add(reader.getValues());
			}
			reader.close();
			for (int row = 0; row < csvList.size(); row++) {
				System.out.println(csvList.get(row)[0]); // name
				System.out.println(csvList.get(row)[1]); // email
				System.out.println(csvList.get(row)[2]); // age
				System.out.println(csvList.get(row)[3]); // sex
				System.out.println("------------"); // �ָ���
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		String filePath = "D:\\anzhuangwenjan\\javacsv\\data1.csv";
		readCsvFile(filePath);

	}
}