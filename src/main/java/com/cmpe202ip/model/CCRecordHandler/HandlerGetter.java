package com.cmpe202ip.model.CCRecordHandler;

public class HandlerGetter {
  private static CCRecordHandler instance;

  public static CCRecordHandler getInstance() {
    if (instance == null) {
      CCRecordHandler masterCCHandler = new MasterCCHandler();
      CCRecordHandler visaCCHandler = new VisaCCHandler();
      CCRecordHandler amExCCHandler = new AmExCCHandler();
      CCRecordHandler discoverCCHandler = new DiscoverCCHandler();
      CCRecordHandler invalidCCHandler = new InvalidCCHandler();

      masterCCHandler.setSuccessor(visaCCHandler);
      visaCCHandler.setSuccessor(amExCCHandler);
      amExCCHandler.setSuccessor(discoverCCHandler);
      discoverCCHandler.setSuccessor(invalidCCHandler);

      instance = masterCCHandler;
    }
    return instance;
  }
}
