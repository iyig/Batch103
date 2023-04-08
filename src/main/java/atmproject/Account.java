package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {


    private int accountNumber; // hesap numarası
    private int pinNumber;// şifre

    private double checkingBalance;// vadesiz hesap bakiyesi
    private double savingBalance;// vadeli hesap bakiyesi
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para cekme==>paraCekmeIslemindenSonraKalanMiktari amount :miktar
    private double calculateCheckingBalanceAfterWithdraw(double amount) {
        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }

    //para yatırma para yatırma işleminden sonra kalan bakiyeyi hesapla
    private double calculateCheckingBalanceAfterDeposit(double amount) {
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    //para cekme :saving hesabından para cekildikten sonra kalan bakiye
    private double calculateSavingBalanceAfterWithdraw(double amount) {
        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    ;

    //para yatırma:saving hesabina para yatırdıktan sonra geri kalan bakiyeyi hesaplayınız
    private double calculateSavingBalanceAfterDeposit(double amount) {
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    //Musteri ile para cekmek icin etkilesime gecelim:checking hesap
    public void getCheckingWithdraw() {
        displayCurrentAmount(checkingBalance);
        System.out.println("Checking hesabinizda bulunan bakiye:" + moneyFormat.format(checkingBalance));
        System.out.println("Cekmek istediğiniz miktari giriniz");
        double amount = input.nextDouble();
        if (amount <= 0) {
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingWithdraw();// recursive method//methodu tekrardan cağırma
        } else if (amount <= checkingBalance) {
            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        } else {
            System.out.println("Yetersiz bakiye!");

        }
    }
//Para yatırma(checking): Müsteri ile para yatırmak icin etkileşim geçelim.
   public void getCheckingDeposit(){
   displayCurrentAmount(checkingBalance);
    System.out.println("Checking hesabinizda bulunan bakiye:" + moneyFormat.format(checkingBalance));
    System.out.println("Yatırmak istediğiniz miktari giriniz");
       double amount= input.nextDouble();
       if (amount<=0){
           System.out.println("sifir veya eksi rakamlar gecersizdir");
           getCheckingDeposit();
       }else{

           calculateCheckingBalanceAfterDeposit(amount);
           System.out.println();
          // System.out.println("Checking hesabinizda bulunan bakiye:" + moneyFormat.format(checkingBalance));
           displayCurrentAmount(checkingBalance);
       }

    }

//Müsteri ile para cekmek için  etkileşime gecelim:saving hesap
public void getSavingWithdraw() {
    displayCurrentAmount(savingBalance);
    //System.out.println("Checking hesabinizda bulunan bakiye:" + moneyFormat.format(checkingBalance));
    System.out.println("Cekmek istediğiniz miktari giriniz");
    double amount = input.nextDouble();

    if (amount<=0){
        System.out.println("sifir veya eksi rakamlar gecersizdir");
        getSavingWithdraw();
    }else if(amount<=savingBalance) {
        calculateSavingBalanceAfterWithdraw(amount);
        System.out.println();
        displayCurrentAmount(savingBalance);
    }else {
        System.out.println("Yetersiz bakiye");

    }
}

//para yatırma(saving):Müsteri ile para yatırmak için etkileşime gecelim

public  void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
    System.out.println("Yatirmak istediğiniz meblayi giriniz");
    double amount=input.nextDouble();
    if(amount<=0){
        System.out.println("Sifir veya eksi rakamlar gecersizdir");
        getSavingDeposit();
    }else{
        calculateSavingBalanceAfterDeposit(amount);
        displayCurrentAmount(savingBalance);
    }
}







//son bakiye göster
    public void displayCurrentAmount(double balance){
        System.out.println(" hesabinizda bulunan bakiye:" + moneyFormat.format(checkingBalance));



    }


}
