package com.chuidiang.examples.restful;

/**
 * The data to be used in the web service.
 * @author Chuidiang
 *
 */
public class Data {
   private int value;
   private String string;

   public Data() {

   }

   public Data(int value, String string) {
      this.value = value;
      this.string = string;
   }

   public String getString() {
      return string;
   }

   public void setString(String string) {
      this.string = string;
   }

   public int getValue() {
      return value;
   }

   public void setValue(int value) {
      this.value = value;
   }

   @Override
   public String toString() {
      return "Data [value=" + value + ", string=" + string + "]";
   }

}
