package com.cmpe202ip.model.CCInput;

import com.cmpe202ip.model.CCRecordHandler.CCRecordHandler;
import com.cmpe202ip.model.CCRecordHandler.HandlerGetter;
import com.cmpe202ip.model.CreditCard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class XMLReader implements ReadingStrategy {
  @Override
  public ArrayList<CreditCard> read(String filePath) throws IOException {
    ArrayList<CreditCard> creditCards = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader(filePath));
    String line = "";
    CCRecordHandler handler = HandlerGetter.getInstance();
    br.readLine();
    br.readLine();
    while ((line = br.readLine()) != null) {
      if (line.compareTo("</root>") == 0) break;
      line = br.readLine();
      String cardNumber = line.substring(16, line.length()-13);
      line = br.readLine();
      String expirationDate = line.substring(20, line.length()-17);
      line = br.readLine();
      String cardHolderName = line.substring(22, line.length()-19);
      CreditCard creditCard = handler.handleRequest(cardNumber, expirationDate, cardHolderName);
      creditCards.add(creditCard);
      br.readLine();
    }
    br.close();
    return creditCards;
  }
}
