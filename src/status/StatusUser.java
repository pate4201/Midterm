/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
/**public class StausUser 
{
   public void statusDetail(String code)
{
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}*/


public class StatusUser 
{
   public enum StatusCode {
      ZERO("REJECTED"),
      ONE("PENDING"),
      TWO("PROCESSING"),
      THREE("APPROVED"),
      INVALID("NOT VALID CODE");

      private final String status;

      StatusCode(String status) {
         this.status = status;
      }

      public String getStatus() {
         return status;
      }
   }

   public void statusDetail(String code) {
      StatusCode status = StatusCode.valueOf(code.toUpperCase());
      System.out.println(status.getStatus());
   }
}

