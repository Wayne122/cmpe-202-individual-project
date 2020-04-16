package com.cmpe202ip.model.CCOutput;

import com.cmpe202ip.model.CreditCard;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JSONWriter implements WritingStrategy {
  @Override
  public void write(ArrayList<CreditCard> creditCards, String filePath) throws IOException {
    FileWriter jsonWriter = new FileWriter(filePath);
    jsonWriter.append("[");
    boolean firstEntity = true;
    for (CreditCard creditCard : creditCards) {
      if (firstEntity) {
        jsonWriter.append("\n");
        firstEntity = false;
      }
      else jsonWriter.append(",\n");
      jsonWriter.append("  {\n");
      jsonWriter.append("    \"CardNumber\": ");
      jsonWriter.append(creditCard.getCardNumber());
      jsonWriter.append(",\n    \"CardType\": \"");
      jsonWriter.append(creditCard.getCardType());
      jsonWriter.append("\",\n    \"Error\": \"");
      jsonWriter.append(creditCard.getError());
      jsonWriter.append("\"\n  }");
    }
    jsonWriter.append("\n]");
    jsonWriter.flush();
    jsonWriter.close();
  }
}
