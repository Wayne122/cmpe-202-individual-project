package com.cmpe202ip.model;

import com.cmpe202ip.model.CCInput.CSVReader;
import com.cmpe202ip.model.CCInput.JSONReader;
import com.cmpe202ip.model.CCInput.ReadingStrategy;
import com.cmpe202ip.model.CCInput.XMLReader;
import com.cmpe202ip.model.CCOutput.CSVWriter;
import com.cmpe202ip.model.CCOutput.JSONWriter;
import com.cmpe202ip.model.CCOutput.WritingStrategy;
import com.cmpe202ip.model.CCOutput.XMLWriter;

import java.io.IOException;

public class CreditCardRecordProcessor {
  private ReadingStrategy readingStrategy;
  private WritingStrategy writingStrategy;
  private String inputFilePath;
  private String outputFilePath;

  public CreditCardRecordProcessor(String _inputFilePath, String _outputFilePath) {
    this.inputFilePath = _inputFilePath;
    this.outputFilePath = _outputFilePath;
    if (this.inputFilePath.endsWith(".csv")) {
      readingStrategy = new CSVReader();
      writingStrategy = new CSVWriter();
    }
    else if (this.inputFilePath.endsWith(".json")) {
      readingStrategy = new JSONReader();
      writingStrategy = new JSONWriter();
    }
    else if (this.inputFilePath.endsWith(".xml")) {
      readingStrategy = new XMLReader();
      writingStrategy = new XMLWriter();
    }
    else System.out.println("Unexpected File Type!");
  }

  public void process() throws IOException {
    writingStrategy.write(readingStrategy.read(this.inputFilePath), this.outputFilePath);
  }
}
