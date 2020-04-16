package com.cmpe202ip.model.CCRecordHandler;

import com.cmpe202ip.model.CreditCard;

public interface CCRecordHandler {
  CreditCard handleRequest(String cardNumber, String expirationDate, String cardHolderName);
  void setSuccessor(CCRecordHandler next);
}
