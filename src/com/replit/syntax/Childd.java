package com.replit.syntax;

class Childd extends Parent{
    public void study (int a ){
    System.out.println("I am a child public method");

  }
  protected void study (String a){
    System.out.println("I am a child protected method");
}
   void study (int a, int b){
    System.out.println("I am a child default method");
}

private  void study (String a, String b){
    System.out.println("I am a child private method");
}
}