package com.soap.ws.xquery.transform.demo.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.saxonica.xqj.SaxonXQConnection;
import com.saxonica.xqj.SaxonXQDataSource;
import com.saxonica.xqj.SaxonXQForwardSequence;
import com.saxonica.xqj.SaxonXQPreparedExpression;

@Service
public class TransformationService {

	public String executeTransformation() {
		String transformedXmlString = null;
		try {
			InputStream inputStream = new FileInputStream(new File("InsertLetterPDFLinksRequestTrx.xq"));
			SaxonXQDataSource ds = new SaxonXQDataSource();
			SaxonXQConnection conn = (SaxonXQConnection) ds.getConnection();
			SaxonXQPreparedExpression exp = (SaxonXQPreparedExpression) conn.prepareExpression(inputStream);
			exp.bindString(new QName("labelLinkUri"), "file:///C:/data/ViewAccountDataInput.xml", null);

			SaxonXQForwardSequence result = (SaxonXQForwardSequence) exp.executeQuery();

			while (result.next()) {
				transformedXmlString = result.getItemAsString(null);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return transformedXmlString;
	}

}