package com.cmpe202ip.model.CCInput;

import com.cmpe202ip.model.CCRecordHandler.CCRecordHandler;
import com.cmpe202ip.model.CCRecordHandler.HandlerGetter;
import com.cmpe202ip.model.CreditCard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JSONReader implements ReadingStrategy {
  @Override
  public ArrayList<CreditCard> read(String filePath) throws IOException {
    ArrayList<CreditCard> creditCards = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader(filePath));
    String line = "";
    String jsonSplitBy = ":";
    CCRecordHandler handler = HandlerGetter.getInstance();
    br.readLine();
    while ((line = br.readLine()) != null) {
      if (line.compareTo("]") == 0) break;
      line = br.readLine().split(jsonSplitBy)[1];
      String cardNumber = line.substring(1, line.length()-1);
      line = br.readLine().split(jsonSplitBy)[1];
      String expirationDate = line.substring(2, line.length()-2);
      line = br.readLine().split(jsonSplitBy)[1];
      String cardHolderName = line.substring(2, line.length()-1);
      CreditCard creditCard = handler.handleRequest(cardNumber, expirationDate, cardHolderName);
      creditCards.add(creditCard);
      br.readLine();
    }
    br.close();
    return creditCards;
  }
}
