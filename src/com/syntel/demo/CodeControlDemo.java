/**
 * 
 */
package com.syntel.demo;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

/**
 * @author RXS8000
 *
 */
public class CodeControlDemo {
	public static final String SEARCHWORD = "public";
	int lineNumber = 0;

	public void getAllFilesFromDirectory(String directoryName) {

		File directory = new File(directoryName);

		// get all the files from a directory
		File[] fList = directory.listFiles();

		for (File file : fList) {
			System.out.println(file.getName());
			int intValue = removeAnnotaion(file);
			System.out.println("Line Number :::::::" + intValue);
		}

	}

	public int removeAnnotaion(File file) {

		LineNumberReader rdr = null;
		try {
			
			if (file.isFile()) {
				FileReader fr = new FileReader(file);
				rdr = new LineNumberReader(fr);
			   // ArrayList<Integer> results = new ArrayList<Integer>();
			    try {
			        String line = rdr.readLine();
			        if (line.indexOf(SEARCHWORD) >= 0) {
			           return rdr.getLineNumber();
			        }
			    } finally {
			        rdr.close();
			    }

				/*FileWriter fw = new FileWriter(file);
				BufferedWriter out = new BufferedWriter(fw);

				for (int j = 0; j < data.size(); j++) {
					out.append(data.get(j));
					out.newLine();
				}

				out.flush();
				out.close();*/
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static void main(String[] args) {
		CodeControlDemo demo = new CodeControlDemo();
		demo.getAllFilesFromDirectory("D://SLSWorkSpace//SampleProject//src//com//syntel//test//");
	}
}