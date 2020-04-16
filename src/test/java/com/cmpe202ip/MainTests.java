package com.cmpe202ip;

import com.cmpe202ip.model.CCInput.CSVReader;
import com.cmpe202ip.model.CCInput.JSONReader;
import com.cmpe202ip.model.CCInput.ReadingStrategy;
import com.cmpe202ip.model.CCInput.XMLReader;
import com.cmpe202ip.model.CreditCard;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTests {

  String cardNum1 = "5410000000000000";
  String expDate1 = "3/20/2030";
  String holderName1 = "Alice";
  String cardType1 = "MasterCard";
  String error1 = "None";

  String cardNum2 = "4120000000000";
  String expDate2 = "4/20/2030";
  String holderName2 = "Bob";
  String cardType2 = "Visa";
  String error2 = "None";

  String cardNum3 = "341000000000000";
  String expDate3 = "5/20/2030";
  String holderName3 = "Eve";
  String cardType3 = "AmericanExpress";
  String error3 = "None";

  String cardNum4 = "6011000000000000";
  String expDate4 = "6/20/2030";
  String holderName4 = "Richard";
  String cardType4 = "Discover";
  String error4 = "None";

  String cardNum5 = "0";
  String expDate5 = "0/0/0";
  String holderName5 = "Charlie";
  String cardType5 = "Invalid";
  String error5 = "InvalidCardNumber";

  @Test
  public void testCSVReader() throws IOException {
    String inputFilePath = "/home/waynelin/GitHub-Repo/cmpe-202-individual-project/SampleInput/Sample.csv";
    ReadingStrategy readingStrategy = new CSVReader();
    ArrayList<CreditCard> creditCards = readingStrategy.read(inputFilePath);

    CreditCard creditCard = creditCards.get(0);
    assertEquals(cardNum1, creditCard.getCardNumber());
    assertEquals(expDate1, creditCard.getExpirationDate());
    assertEquals(holderName1, creditCard.getCardHolderName());
    assertEquals(cardType1, creditCard.getCardType());
    assertEquals(error1, creditCard.getError());

    creditCard = creditCards.get(1);
    assertEquals(cardNum2, creditCard.getCardNumber());
    assertEquals(expDate2, creditCard.getExpirationDate());
    assertEquals(holderName2, creditCard.getCardHolderName());
    assertEquals(cardType2, creditCard.getCardType());
    assertEquals(error2, creditCard.getError());

    creditCard = creditCards.get(2);
    assertEquals(cardNum3, creditCard.getCardNumber());
    assertEquals(expDate3, creditCard.getExpirationDate());
    assertEquals(holderName3, creditCard.getCardHolderName());
    assertEquals(cardType3, creditCard.getCardType());
    assertEquals(error3, creditCard.getError());

    creditCard = creditCards.get(3);
    assertEquals(cardNum4, creditCard.getCardNumber());
    assertEquals(expDate4, creditCard.getExpirationDate());
    assertEquals(holderName4, creditCard.getCardHolderName());
    assertEquals(cardType4, creditCard.getCardType());
    assertEquals(error4, creditCard.getError());

    creditCard = creditCards.get(4);
    assertEquals(cardNum5, creditCard.getCardNumber());
    assertEquals(expDate5, creditCard.getExpirationDate());
    assertEquals(holderName5, creditCard.getCardHolderName());
    assertEquals(cardType5, creditCard.getCardType());
    assertEquals(error5, creditCard.getError());
  }

  @Test
  public void testJSONReader() throws IOException {
    String inputFilePath = "/home/waynelin/GitHub-Repo/cmpe-202-individual-project/SampleInput/Sample.json";
    ReadingStrategy readingStrategy = new JSONReader();
    ArrayList<CreditCard> creditCards = readingStrategy.read(inputFilePath);

    CreditCard creditCard = creditCards.get(0);
    assertEquals(cardNum1, creditCard.getCardNumber());
    assertEquals(expDate1, creditCard.getExpirationDate());
    assertEquals(holderName1, creditCard.getCardHolderName());
    assertEquals(cardType1, creditCard.getCardType());
    assertEquals(error1, creditCard.getError());

    creditCard = creditCards.get(1);
    assertEquals(cardNum2, creditCard.getCardNumber());
    assertEquals(expDate2, creditCard.getExpirationDate());
    assertEquals(holderName2, creditCard.getCardHolderName());
    assertEquals(cardType2, creditCard.getCardType());
    assertEquals(error2, creditCard.getError());

    creditCard = creditCards.get(2);
    assertEquals(cardNum3, creditCard.getCardNumber());
    assertEquals(expDate3, creditCard.getExpirationDate());
    assertEquals(holderName3, creditCard.getCardHolderName());
    assertEquals(cardType3, creditCard.getCardType());
    assertEquals(error3, creditCard.getError());

    creditCard = creditCards.get(3);
    assertEquals(cardNum4, creditCard.getCardNumber());
    assertEquals(expDate4, creditCard.getExpirationDate());
    assertEquals(holderName4, creditCard.getCardHolderName());
    assertEquals(cardType4, creditCard.getCardType());
    assertEquals(error4, creditCard.getError());

    creditCard = creditCards.get(4);
    assertEquals(cardNum5, creditCard.getCardNumber());
    assertEquals(expDate5, creditCard.getExpirationDate());
    assertEquals(holderName5, creditCard.getCardHolderName());
    assertEquals(cardType5, creditCard.getCardType());
    assertEquals(error5, creditCard.getError());
  }

  @Test
  public void testXMLReader() throws IOException {
    String inputFilePath = "/home/waynelin/GitHub-Repo/cmpe-202-individual-project/SampleInput/Sample.xml";
    ReadingStrategy readingStrategy = new XMLReader();
    ArrayList<CreditCard> creditCards = readingStrategy.read(inputFilePath);

    CreditCard creditCard = creditCards.get(0);
    assertEquals(cardNum1, creditCard.getCardNumber());
    assertEquals(expDate1, creditCard.getExpirationDate());
    assertEquals(holderName1, creditCard.getCardHolderName());
    assertEquals(cardType1, creditCard.getCardType());
    assertEquals(error1, creditCard.getError());

    creditCard = creditCards.get(1);
    assertEquals(cardNum2, creditCard.getCardNumber());
    assertEquals(expDate2, creditCard.getExpirationDate());
    assertEquals(holderName2, creditCard.getCardHolderName());
    assertEquals(cardType2, creditCard.getCardType());
    assertEquals(error2, creditCard.getError());

    creditCard = creditCards.get(2);
    assertEquals(cardNum3, creditCard.getCardNumber());
    assertEquals(expDate3, creditCard.getExpirationDate());
    assertEquals(holderName3, creditCard.getCardHolderName());
    assertEquals(cardType3, creditCard.getCardType());
    assertEquals(error3, creditCard.getError());

    creditCard = creditCards.get(3);
    assertEquals(cardNum4, creditCard.getCardNumber());
    assertEquals(expDate4, creditCard.getExpirationDate());
    assertEquals(holderName4, creditCard.getCardHolderName());
    assertEquals(cardType4, creditCard.getCardType());
    assertEquals(error4, creditCard.getError());

    creditCard = creditCards.get(4);
    assertEquals(cardNum5, creditCard.getCardNumber());
    assertEquals(expDate5, creditCard.getExpirationDate());
    assertEquals(holderName5, creditCard.getCardHolderName());
    assertEquals(cardType5, creditCard.getCardType());
    assertEquals(error5, creditCard.getError());
  }

}
