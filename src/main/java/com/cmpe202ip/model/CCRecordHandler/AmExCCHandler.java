package com.cmpe202ip.model.CCRecordHandler;

import com.cmpe202ip.model.CreditCard;

public class AmExCCHandler implements CCRecordHandler {
  private CCRecordHandler successor = null;

  public CreditCard handleRequest(String cardNumber, String expirationDate, String cardHolderName) {
    if ( cardNumber.length() == 15 && (int) cardNumber.charAt(0) == 51 && ( (int) cardNumber.charAt(1) == 52 || (int) cardNumber.charAt(1) == 55 ) ) {
      return new CreditCard(cardNumber, expirationDate, cardHolderName, "AmericanExpress", "None");
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
