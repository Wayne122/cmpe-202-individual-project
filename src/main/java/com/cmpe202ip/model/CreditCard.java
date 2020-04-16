package com.cmpe202ip.model;

public class CreditCard {
  private String cardNumber;
  private String expirationDate;
  private String cardHolderName;
  private String cardType;
  private String error;

  public CreditCard(String _cardNumber, String _expirationDate, String _cardHolderName, String _cardType, String _error) {
    this.cardNumber = _cardNumber;
    this.expirationDate = _expirationDate;
    this.cardHolderName = _cardHolderName;
    this.cardType = _cardType;
    this.error = _error;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getExpirationDate() {
    return expirationDate;
  }

  public String getCardHolderName() {
    return cardHolderName;
  }

  public String getCardType() {
    return cardType;
  }

  public String getError() {
    return error;
  }

}
