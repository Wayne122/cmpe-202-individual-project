package com.cmpe202ip.model.CCOutput;

import com.cmpe202ip.model.CreditCard;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class XMLWriter implements WritingStrategy {
  @Override
  public void write(ArrayList<CreditCard> creditCards, String filePath) throws IOException {
    FileWriter xmlWriter = new FileWriter(filePath);
    xmlWriter.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root>");
    for (CreditCard creditCard : creditCards) {
      xmlWriter.append("\n  <row>\n    <CardNumber>");
      xmlWriter.append(creditCard.getCardNumber());
      xmlWriter.append("</CardNumber>\n    <CardType>");
      xmlWriter.append(creditCard.getCardType());
      xmlWriter.append("</CardType>\n    <Error>");
      xmlWriter.append(creditCard.getError());
      xmlWriter.append("</Error>\n  </row>");
    }
    xmlWriter.append("\n</root>");
    xmlWriter.flush();
    xmlWriter.close();
  }
}
