package com.cmpe202ip.model.CCOutput;

import com.cmpe202ip.model.CreditCard;

import java.io.IOException;
import java.util.ArrayList;

public interface WritingStrategy {
  void write(ArrayList<CreditCard> creditCards, String filePath) throws IOException;
}
