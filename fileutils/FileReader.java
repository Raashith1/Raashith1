package fileutils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileReader {

	public List<String> read(String filePath) {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lines;
	}

}

