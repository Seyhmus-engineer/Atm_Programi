
package ATM;


public class Main_Class {

    
    public static void main(String[] args) {
       
        ATM atm=new ATM();
        
        
        Hesap hesap =new Hesap("Ahmet Can","12345",2000);
        
       atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor.....");
        
    }
    
}
