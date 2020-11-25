class Cookie{
  private int number;
  private int bakeTemp;
  private int bakeTime;
  private boolean isReady;

  Cookie(){
    number = 0;
    bakeTemp=0;
    bakeTime = 0;
    isReady = false;
  }
  Cookie(int aNum, int aBakeTemp, int aBakeTime){
    number=aNum;
    bakeTemp = aBakeTemp;
    bakeTime =  aBakeTime;
    isReady = false;
  }

  boolean getIsReady(){
    return isReady;
  }

  void setNumber(int aCookieNumber){
    number = aCookieNumber;
  }

  void bake(int aBakeTemp, int aBakeTime){
    System.out.println(number +" cookies were baked at "+ aBakeTemp + " degrees F for " + aBakeTime + " minutes.");
  }
}