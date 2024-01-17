package com.avacre.pdf;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class MergePDF {

	public static void main(String[] args) throws IOException {

		// loading all the pdf files we wish to merge

		File file1 = new File("C:/Users/ASUS/Downloads/sample-1.pdf");
		File file2 = new File("C:/Users/ASUS/Downloads/sample-2.pdf");
		File file3 = new File("C:/Users/ASUS/Downloads/sample-33.pdf");

		// Instantiating PDFMergerUtility class

		PDFMergerUtility obj = new PDFMergerUtility();

		// Setting the destination file path

		obj.setDestinationFileName("C:/Users/ASUS/Downloads/PL16646-signed.pdf");

		// Add all source files, to be merged

		obj.addSource(file1);
		obj.addSource(file2);
		obj.addSource(file3);

		// Merging documents

		obj.mergeDocuments();

		System.out.println("PDF Documents merged to a single file");
	}
}