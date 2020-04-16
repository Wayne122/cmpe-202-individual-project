package com.cmpe202ip.model.CCRecordHandler;

import com.cmpe202ip.model.CreditCard;

public class MasterCCHandler implements CCRecordHandler {
  private CCRecordHandler successor = null;

  public CreditCard handleRequest(String cardNumber, String expirationDate, String cardHolderName) {
    if ( cardNumber.length() == 16 && (int) cardNumber.charAt(0) == 53 && ( (int) cardNumber.charAt(1) >= 49 && (int) cardNumber.charAt(1) <= 53 ) ) {
      return new CreditCard(cardNumber, expirationDate, cardHolderName, "MasterCard", "None");
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
