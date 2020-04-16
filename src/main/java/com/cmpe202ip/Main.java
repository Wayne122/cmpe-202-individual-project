package com.cmpe202ip;

import com.cmpe202ip.model.CreditCardRecordProcessor;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    /*
    Chain of responsibility
    Singleton
    Strategy
     */

    CreditCardRecordProcessor creditCardRecordProcessor = new CreditCardRecordProcessor(args[0], args[1]);
    creditCardRecordProcessor.process();
    System.out.println("Succeeded!");
  }
}
