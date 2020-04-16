package com.cmpe202ip.model.CCOutput;

import com.cmpe202ip.model.CreditCard;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVWriter implements WritingStrategy {
  @Override
  public void write(ArrayList<CreditCard> creditCards, String filePath) throws IOException {
    FileWriter csvWriter = new FileWriter(filePath);
    csvWriter.append("CardNumber,CardType,Error");
    for (CreditCard creditCard : creditCards) {
      csvWriter.append("\n");
      csvWriter.append(creditCard.getCardNumber());
      csvWriter.append(",");
      csvWriter.append(creditCard.getCardType());
      csvWriter.append(",");
      csvWriter.append(creditCard.getError());
    }
    csvWriter.flush();
    csvWriter.close();
  }
}
