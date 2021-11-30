import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PdfReaderTest {
	
	@Test
	public void readPDFTest() throws IOException {
		
		
		URL url=new URL("https://www.betterteam.com/download/job-application-form-template-download-standard-20170814.pdf");
		InputStream is=url.openStream();//it will open the stream with the particular pdf which is hosted on a particular site
		BufferedInputStream fileparse=new BufferedInputStream(is); /*A BufferedInputStream adds functionality to another input stream-namely, 
																	the ability to buffer the input and to support the mark and reset methods.*/
		
		PDDocument document=null;
		//Initilaze the document
		document=PDDocument.load(fileparse);  
		String pdfContent=new PDFTextStripper().getText(document); //getText() will return a string and store inside a string
		System.out.println(pdfContent);
			
	}

}
