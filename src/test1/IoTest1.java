package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;

public class IoTest1 {

	public static void readCsvFile(String filePath) {
		
		try {
			ArrayList<String[]> csvList = new ArrayList<String[]>(); // ������������
			// һ�����������Ϳ�����
			CsvReader reader = new CsvReader(filePath, ',',
					Charset.forName("SJIS"));
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			reader.readHeaders(); // ������ͷ�����Ҫ��ͷ�Ļ�����Ҫд��䡣
			br.readLine();
			String line;
			while ((line=br.readLine())!=null) { // ���ж������ͷ������
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
				System.out.println("------------"); // �ָ���
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
