package com.maximus.xmltransformer.xmltransformerservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;

import org.springframework.stereotype.Service;

import com.saxonica.xqj.SaxonXQDataSource;

@Service
public class TransformationService {

	public String execute(String toTransform) throws FileNotFoundException, XQException, XMLStreamException {
		String transformedXmlData = null;
		InputStream inputStream = new FileInputStream(new File("src/main/resources/ServiceClient.xq"));
		XQDataSource ds = new SaxonXQDataSource();
		XQConnection conn = ds.getConnection();
		XQPreparedExpression exp = conn.prepareExpression(inputStream);

		System.out.println("123 " + toTransform);

		boolean writeFile = writeTransformedXmlData(toTransform);
		System.out.println("writeFile1 = "+writeFile);
		
		if (writeFile) {
			System.out.println("writeFile2 = "+writeFile);
			exp.bindString(new QName("labelLinkUri"),
					"file:///C:/Sid/codebase/files/ViewAccountDataTransformedInput.xml", null);
			XQResultSequence result = exp.executeQuery();
			
			while (result.next()) {
				transformedXmlData = result.getItemAsString(null);
				System.out.println("TransformationService transformed XML data: " + transformedXmlData);
			}
		} 
		return transformedXmlData;
	}

	public boolean writeTransformedXmlData(String xmlData) {
		try {
			OutputStream outputStream;

			outputStream = new FileOutputStream("C:\\Sid\\codebase\\files\\ViewAccountDataTransformedInput.xml");
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
