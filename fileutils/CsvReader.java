package fileutils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import common.Symbol;

public class CsvReader {

	public List<Map<String, String>> read(List<String> lines) throws Exception {
		List<Map<String, String>> recordMapList = new LinkedList<Map<String, String>>();

		// Title and Data count should be 2
		if (lines.size() < 2) {
			throw new Exception("Empty Data Set");
		}

		String titleLine = lines.get(0);
		String[] headers = titleLine.split(Symbol.COMMA);

		for (int i = 1; i < lines.size(); i++) {
			String[] words = lines.get(i).split(Symbol.COMMA);
			Map<String, String> recordMap = new HashMap<String, String>();
			for (int j = 0; j < words.length; j++) {
				recordMap.put(headers[j], words[j]);
			}

			recordMapList.add(recordMap);
		}

		return recordMapList;
	}

}
