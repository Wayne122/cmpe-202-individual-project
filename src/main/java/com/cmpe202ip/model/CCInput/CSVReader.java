package com.cmpe202ip.model.CCInput;

import com.cmpe202ip.model.CCRecordHandler.CCRecordHandler;
import com.cmpe202ip.model.CCRecordHandler.HandlerGetter;
import com.cmpe202ip.model.CreditCard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader implements ReadingStrategy {
  @Override
  public ArrayList<CreditCard> read(String filePath) throws IOException {
    ArrayList<CreditCard> creditCards = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader(filePath));
    String line = "";
    String cvsSplitBy = ",";
    CCRecordHandler handler = HandlerGetter.getInstance();
    br.readLine();
    while ((line = br.readLine()) != null) {
      String[] ccRecord = line.split(cvsSplitBy);
      //System.out.println("CardNumber= " + ccRecord[0] + ", ExpirationDate= " + ccRecord[1] + ", NameOfCardholder= " + ccRecord[2]);
      CreditCard creditCard = handler.handleRequest(ccRecord[0], ccRecord[1], ccRecord[2]);
      creditCards.add(creditCard);
    }
    br.close();
    return creditCards;
  }
}
