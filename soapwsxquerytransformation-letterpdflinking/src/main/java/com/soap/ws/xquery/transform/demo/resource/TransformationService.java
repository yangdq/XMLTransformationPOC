package com.soap.ws.xquery.transform.demo.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.context.MessageContext;

import com.saxonica.xqj.SaxonXQConnection;
import com.saxonica.xqj.SaxonXQDataSource;
import com.saxonica.xqj.SaxonXQForwardSequence;
import com.saxonica.xqj.SaxonXQPreparedExpression;

@Service
public class TransformationService {

	public boolean writeRequest(MessageContext mc) {
		try {
			OutputStream outputStream;

			outputStream = new FileOutputStream("C:\\Sid\\codebase\\files\\InsertLetterPDFLinksRequestTrx.xml");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

			WebServiceMessage wsm = mc.getRequest();
			wsm.writeTo(outputStream);

			outputStreamWriter.close();
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean writeTransformedXmlData(String xmlData) {
		try {
			OutputStream outputStream;

			outputStream = new FileOutputStream("C:\\Sid\\codebase\\files\\InsertLetterPDFLinksRequestTransformed.xml");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

			outputStreamWriter.write(xmlData);
			outputStreamWriter.close();
			return true;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public String executeTransformation() {
		String transformedXmlString = null;
		try {
			InputStream inputStream = new FileInputStream(new File("C:/Sid/codebase/files/InsertLetterPDFLinksRequestTrx.xq"));
			SaxonXQDataSource ds = new SaxonXQDataSource();
			SaxonXQConnection conn = (SaxonXQConnection) ds.getConnection();
			SaxonXQPreparedExpression exp = (SaxonXQPreparedExpression) conn.prepareExpression(inputStream);
			exp.bindString(new QName("labelLinkUri"), "file:///C:/Sid/codebase/files/InsertLetterPDFLinksRequestTrx.xml", null);

			SaxonXQForwardSequence result = (SaxonXQForwardSequence) exp.executeQuery();

			while (result.next()) {
				transformedXmlString = result.getItemAsString(null);
				System.out.println("transformedXmlString= " + transformedXmlString);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return transformedXmlString;
	}
	
	public String readTransformedXmlData(String filePath) {
		try {
			String data = null; 
		    data = new String(Files.readAllBytes(Paths.get(filePath))); 
			return data;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}