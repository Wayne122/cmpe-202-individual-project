package com.cmpe202ip.model.CCInput;

import com.cmpe202ip.model.CreditCard;

import java.io.IOException;
import java.util.ArrayList;

public interface ReadingStrategy {
  ArrayList<CreditCard> read(String filePath) throws IOException;
}
