package com.cmpe202ip.model.CCInput;

import com.cmpe202ip.model.CCRecordHandler.CCRecordHandler;
import com.cmpe202ip.model.CCRecordHandler.HandlerGetter;
import com.cmpe202ip.model.CreditCard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVReader implements ReadingStrategy {
  @Override
  public ArrayList<CreditCard> read(String filePath) throws IOException {
    ArrayList<CreditCard> creditCards = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader(filePath));
    String line;
    String cvsSplitBy = ",";
    CCRecordHandler handler = HandlerGetter.getInstance();
    line = br.readLine();
    String[] columns = line.split(cvsSplitBy);
    HashMap<String, Integer> columnOrder = new HashMap<>();
    Integer c = 0;
    for (String column : columns) {
      columnOrder.put(column, c);
      c++;
    }
    while ((line = br.readLine()) != null) {
      String[] ccRecord = line.split(cvsSplitBy);
      // System.out.println("CardNumber= " + ccRecord[0] + ", ExpirationDate= " + ccRecord[1] + ", NameOfCardholder= " + ccRecord[2]);
      CreditCard creditCard = handler.handleRequest(ccRecord[columnOrder.get("CardNumber")], ccRecord[columnOrder.get("ExpirationDate")], ccRecord[columnOrder.get("NameOfCardholder")]);
      creditCards.add(creditCard);
    }
    br.close();
    return creditCards;
  }
}
