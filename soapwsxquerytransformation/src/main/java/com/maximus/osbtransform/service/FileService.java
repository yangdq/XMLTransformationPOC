package com.maximus.osbtransform.service;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.springframework.stereotype.Service;

@Service
public class FileService {

	public boolean writeTransformedXmlData(String xmlData) {
		
		if(xmlData == null) {
			return false;
		}
		
		try {
			OutputStream outputStream;

			outputStream = new FileOutputStream("C:\\data\\ViewAccountDataTransformedInput.xml");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

			outputStreamWriter.write(xmlData);
			outputStreamWriter.close();
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}


}