package com.cmpe202ip.model.CCRecordHandler;

import com.cmpe202ip.model.CreditCard;

public class DiscoverCCHandler implements CCRecordHandler {
  private CCRecordHandler successor = null;

  public CreditCard handleRequest(String cardNumber, String expirationDate, String cardHolderName) {
    if ( cardNumber.length() == 16 && cardNumber.substring(0,4).compareTo("6011") == 0 ) {
      return new CreditCard(cardNumber, expirationDate, cardHolderName, "Discover", "None");
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
