package com.cmpe202ip.model.CCRecordHandler;

import com.cmpe202ip.model.CreditCard;

public class InvalidCCHandler implements CCRecordHandler{

  public CreditCard handleRequest(String cardNumber, String expirationDate, String cardHolderName) {
    return new CreditCard(cardNumber, expirationDate, cardHolderName, "Invalid", "InvalidCardNumber");
  }

  public void setSuccessor(CCRecordHandler next) {
    // Do nothing
  }
}
