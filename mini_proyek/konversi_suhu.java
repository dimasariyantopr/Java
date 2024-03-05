package konversi_suhu;
import java.util.*;

public class Konversi_suhu {

    public static void main(String[] args) {
       
        System.out.println("=== Program Konversi Suhu === ");
        
        Scanner inputUser;
        int input_suhu;
        char input_skala;
        char output_skala;
        int output_suhu;
        
        inputUser = new Scanner(System.in);
        System.out.print("Masukan suhu: ");
        input_suhu = inputUser.nextInt();
        
        System.out.print("Dari skala (C, F, K, R): ");
        input_skala = inputUser.next().charAt(0);
        
        System.out.print("Dikonversi ke skala (C, F, K, R): ");
        output_skala = inputUser.next().charAt(0);
        
        if (input_skala =='C' && output_skala=='F'){  
        output_suhu = (input_suhu*9/5)+32;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        } else if (input_skala =='C' && output_skala=='K'){  
        output_suhu = input_suhu+273;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        } else if (input_skala =='C' && output_skala=='R'){  
        output_suhu = (4/5)*input_suhu;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        
        } else if (input_skala =='F' && output_skala=='C'){  
        output_suhu = (input_suhu-32)*5/9;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        } else if (input_skala =='F' && output_skala=='K'){  
        output_suhu = (input_suhu-32)*5/9+273;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        } else if (input_skala =='F' && output_skala=='R'){  
        output_suhu = 4/9*(input_suhu-32);
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);

       } else if (input_skala =='K' && output_skala=='C'){  
        output_suhu = input_suhu-273;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        } else if (input_skala =='K' && output_skala=='F'){  
        output_suhu = ((input_suhu-273)*9/5)+32;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        } else if (input_skala =='K' && output_skala=='R'){  
        output_suhu = 4/5*(input_suhu-273);
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        
        } else if (input_skala =='R' && output_skala=='C'){  
        output_suhu = 5/4*input_suhu;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        } else if (input_skala =='R' && output_skala=='F'){  
        output_suhu = 9/4*input_suhu+32;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        } else if (input_skala =='R' && output_skala=='R'){  
        output_suhu = (5/4)*input_suhu+273;
        System.out.println("Hasil konversi suhu = " +input_suhu+" "+input_skala+" setara dengan "+output_suhu+" "+output_skala);
        
        } else {
        System.out.println("Masukan salah");
        }
    }
}
