/*
package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Options extends Account {

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
boolean flag=true;
    //Checking hesap işlemleri=>
    public void checkingsOperations() {
        do {

            displayMessage();


            int option = input.nextInt();
            if (option == 4) {
                break;
            }
            switch (option) {
                case 1:
                    System.out.println("Checking hesabinizda kalan bakiye:" + moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Yanlıs secenek!Lutfen 1,2,3 veya 4 u kuaniniz");

            }


        } while (true);
        getAccountTypes();
    }


        //vadeli hesap işlemleri
        public void savingOperations () {

            do {

                displayMessage();
                int option = input.nextInt();
                if (option == 4) {
                    break;
                }
                switch (option) {
                    case 1:
                        System.out.println("Checking hesabinizda kaan bakiye:" + moneyFormat.format(getCheckingBalance()));
                        break;
                    case 2:
                        getSavingWithdraw();
                        break;
                    case 3:
                        getSavingDeposit();
                        break;
                    default:
                        System.out.println("Yanlıs secenek!Lutfen 1,2,3,veya 4 u kulanık u kulaniniz");
                }
            } while (true);
            getAccountTypes();
        }

    }
       //Ilgili hesabi seciniz!
    public void getAccountTypes() {
        System.out.println("Hangi hesapta işlem yapmak istersiniz?");
        System.out.println("1:Checking account");//vadesiz hesap
        System.out.println("2:Saving account");// vadeli hesap
        System.out.println("3:Quit");


        int option = input.nextInt();

        switch (option) {

            case 1:
                System.out.println("Checking/vadesiz hesabinizdasiniz");
                checkingsOperations();
                break;
            case 2:
                System.out.println("Saving/vadeli hesabiınızdasiniz");
                savingOperations();
                break;
            case 3:
                System.out.println("ATM makinemizi kuandiğınız için teşekkür ederiz ");
                flag=false;
                break;
            default:
                System.out.println("Yanlış secenek!Lütfen 1,2 veya 4 u kulaniniz");

        }

        }





        //kişi için secenekleri görüntüle
        public void displayMessage(){


            System.out.println("Option seciniz");
            System.out.println("1:View Balance");//Bakiyenizi kontrol edinizHesap özeti
            System.out.println("2:Withdraw");// para çekme
            System.out.println("3:Depoait");//para yatırma
            System.out.println("4:Exit");// işlemi sonlandırma
        }

    }


*/