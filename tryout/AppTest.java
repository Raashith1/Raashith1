  
package tryout;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import fileutils.CsvReader;

public class AppTest {

	CsvReader csvReader = new CsvReader();

	@Test
	public void testReadCsv() {
		List<String> lines = new LinkedList<String>();
		lines.add("firstName,lastName,age");
		lines.add("Mohamed,Jameel,30");
		lines.add("Asraf,Abdullah,25");
		lines.add("Raj,Mohamed,60");

		List<Map<String, String>> maps;
		try {
			maps = csvReader.read(lines);
			for (Map<String, String> map : maps) {
				for (String key : map.keySet()) {
					System.out.print(key + " : ");
					System.out.println(map.get(key));
				}
				System.out.println("-----------------------");
			}
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}