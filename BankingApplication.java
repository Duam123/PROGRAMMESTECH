import java.util.Scanner;
public class BankingApplication{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       BankAccount bank1=new BankAccount("dua","1");
       bank1.showMenu();

    }
}
  class BankAccount {
      int balance;
      int previoustranscation;
      String customername;
      String customerid;

      BankAccount(String cname, String cid) {
          customername = cname;
          customerid = cid;

      }

      void depoist(int amount) {
          if (amount != 0) {
              balance = balance + amount;
              previoustranscation = amount;

          }
      }

      void withdraw(int amount) {
          if (amount != 0) {
              balance = balance - amount;
              previoustranscation = -amount;
          }

      }

      void getprevioustranscation() {
          if (previoustranscation > 0) {
              System.out.println("deposied  :" + previoustranscation);
          } else if (previoustranscation < 0) {
              System.out.println("withdraw :" + Math.abs(previoustranscation));
          } else {
              System.out.println("no trnascation i occueered");
          }
      }

      void showMenu() {
          char option = '\0';
          Scanner sc = new Scanner(System.in);
          System.out.println("welcome :" + customername);
          System.out.println("your id is :" + customerid);
          System.out.println();
          System.out.println(" A. check balance");
          System.out.println("B. deposit");
          System.out.println("C. withdraw");
          System.out.println("D. prevouis transcation");
          System.out.println("E. exit");
          do {
              System.out.println("=================================");
              System.out.println("ENTER THE OPTION");
              System.out.println("=====================================");
              option = sc.next().charAt(0);
              //Character.toUpperCase(option);
              switch (option) {
                  case 'A':
                      System.out.println("=================================");
                      System.out.println("balance is:" + balance);
                      System.out.println("=================================");
                      System.out.println();
                      break;
                  case 'B':
                      System.out.println("=================================");
                      System.out.println("enter the amount of deposit");
                      System.out.println("=================================");
                      int amount = sc.nextInt();
                      depoist(amount);
                      System.out.println();
                      break;
                  case 'C':
                      System.out.println("=================================");
                      System.out.println("enter the amount to withdraw");
                      System.out.println("=================================");
                      int amount2 = sc.nextInt();
                      withdraw(amount2);
                      System.out.println("");
                      break;
                  case 'D':
                      System.out.println("=================================");
                      System.out.println(previoustranscation);
                      System.out.println("=================================");
                      System.out.println();
                      break;
                  case 'E':
                      System.out.println("=================================");
                      break;
                  default:
                      System.out.println("invalid option! please try again");
                      break;

              }
          } while (option != 'E');

      }
  }



