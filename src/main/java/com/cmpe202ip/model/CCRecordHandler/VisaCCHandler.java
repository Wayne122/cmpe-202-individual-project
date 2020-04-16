package com.cmpe202ip.model.CCRecordHandler;

import com.cmpe202ip.model.CreditCard;

public class VisaCCHandler implements CCRecordHandler {
  private CCRecordHandler successor = null;

  public CreditCard handleRequest(String cardNumber, String expirationDate, String cardHolderName) {
    if ( ( cardNumber.length() == 16 || cardNumber.length() == 13 ) && (int) cardNumber.charAt(0) == 52 ) {
      return new CreditCard(cardNumber, expirationDate, cardHolderName, "Visa", "None");
    }
    else {
      if ( successor != null ) return successor.handleRequest(cardNumber, expirationDate, cardHolderName);
      else return null;
    }
  }

  public void setSuccessor(CCRecordHandler next) {
    this.successor = next;
  }
}
