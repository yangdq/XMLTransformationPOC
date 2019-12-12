package com.xml.transform;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.namespace.QName;

import com.saxonica.xqj.SaxonXQConnection;
import com.saxonica.xqj.SaxonXQDataSource;
import com.saxonica.xqj.SaxonXQForwardSequence;
import com.saxonica.xqj.SaxonXQPreparedExpression;

public class ExecuteXquery {
	
	public static void main(String[] args) {
		executeTransformation();
	}
	
	
	public static String executeTransformation() {
		String transformedXmlString = null;
		try {
			InputStream inputStream = new FileInputStream(new File("ViewAccountDataTrx.xq"));
			SaxonXQDataSource ds = new SaxonXQDataSource();
			SaxonXQConnection conn = (SaxonXQConnection) ds.getConnection();
			SaxonXQPreparedExpression exp = (SaxonXQPreparedExpression) conn.prepareExpression(inputStream);
			exp.bindString(new QName("labelLinkUri"), "file:///C:/Sid/codebase/myprojects/TransformXml/ViewAccountDataInput.xml", null);

			SaxonXQForwardSequence result = (SaxonXQForwardSequence) exp.executeQuery();

			while (result.next()) {
				transformedXmlString = result.getItemAsString(null);
				System.out.println(transformedXmlString);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return transformedXmlString;
	}

}
