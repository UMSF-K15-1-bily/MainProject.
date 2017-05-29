
package simplecalk;

import java.util.Scanner;

public class SimpleCalk {
    
    public static int schet (int r, int v,String o){
        int res=0;
        switch (o) {
            case "+":
               res=r + v;
                break;
            case "-":
               res=r - v;
                break;
            case "*":
              res= r * v;
                break;
            case "/":
               res= r / v ;
                break;
    
    }
        return res ;
    }
    public static float schet (float r, float v,String o){
        float res=0;
        switch (o) {
            case "+":
               res=r + v;
                break;
            case "-":
               res=r - v;
                break;
            case "*":
              res= r * v;
                break;
            case "/":
               res= r / v ;
                break;
    
    }
        return res ;
    }
  public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String fnum = "";//первое число в сторке
        String snum = "";//второе число в строке
        int cout = 0;
        int operand1 = 0;
        float floatoperand1=0;
        int operand2 = 0;
        float floatoperand2=0;
        String operator = "";
        System.out.println("готов считать");
        String a = in.nextLine();
        char[] Strarr = a.toCharArray();
        for (int i = 0; i < Strarr.length; i++) {
            cout++;
            if (Character.isDigit(Strarr[i])) {
                String digits = Character.toString(Strarr[i]);
                fnum = fnum + digits;
            } else {
                operator = Character.toString(Strarr[i]);
                operand1 = Integer.parseInt(fnum);
                floatoperand1=Float.parseFloat(fnum);
                break;
            }
        }
        for (int e = cout; e < Strarr.length; e++) {
            String digits2 = Character.toString(Strarr[e]);
            snum = snum + digits2;
            operand2 = Integer.parseInt(snum);
            floatoperand2= Float.parseFloat(snum);
        }
        int result = schet(operand1,operand2,operator);
        float floatresult = schet(floatoperand1,floatoperand2,operator);
        System.out.println(result);
         System.out.println(floatresult);
    }   
    
}
