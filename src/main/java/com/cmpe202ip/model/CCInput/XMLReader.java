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
    String line;
    String xmlSplitBy = "[<>]";
    CCRecordHandler handler = HandlerGetter.getInstance();
    String cardNumber = "";
    String expirationDate = "";
    String cardHolderName = "";
    while ((line = br.readLine()) != null) {
      if (line.compareTo("</root>") == 0) break;
      else {
        String[] splitLine = line.replace(" ", "").replace("\t", "").split(xmlSplitBy);
        if (line.contains("CardNumber")) {
          cardNumber = splitLine[2];
        }
        else if (line.contains("ExpirationDate")) {
          expirationDate = splitLine[2];
        }
        else if (line.contains("NameOfCardholder")) {
          cardHolderName = splitLine[2];
        } else if (line.replace(" ", "").replace("\t", "").compareTo("</row>") == 0) {
          CreditCard creditCard = handler.handleRequest(cardNumber, expirationDate, cardHolderName);
          creditCards.add(creditCard);
          cardNumber = "";
          expirationDate = "";
          cardHolderName = "";
        }
      }
    }
    br.close();
    return creditCards;
  }
}
