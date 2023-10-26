import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        //Q1
//        System.out.println("Input first number: ");
//        int num1 = s.nextInt();
//        System.out.println("Input second number: ");
//        int num2 = s.nextInt();
//        System.out.println(num1+"+"+num2+"="+(num1+num2));
//        System.out.println(num1+"-"+num2+"="+(num1-num2));
//        System.out.println(num1+"*"+num2+"="+(num1*num2));
//        System.out.println(num1+"/"+num2+"="+(num1/num2));
//        System.out.println(num1+"mod"+num2+"="+(num1%num2));
//
//
//        //Q2
//        System.out.println("Input a number:");
//        int multi = s.nextInt();
//        for (int i = 1 ; i <=10 ; i++) {
//            System.out.println(multi+"*"+i+"="+(multi*i));
//
//        }


        //Q3

//        System.out.println("please enter the Radius:");
//        double radius = s.nextDouble();
//        double parameter = 2*3.14*radius;
//        System.out.println("Parameter is="+parameter);
//        System.out.println("Area is="+(3.14*radius*radius));


        //Q4
//        System.out.println("Enter the count of numbers:");
//        int count = s.nextInt();
//        double result= 0;
//        for (int i = 1; i <=count ; i++) {
//            System.out.println("Enter an integer");
//            double sum = s.nextDouble();
//            result=result+sum;
//
//        }
//        System.out.println("The average is :"+(result/count));


        //Q5

//        System.out.println("Input the first number:");
//        int number1=s.nextInt();
//        System.out.println("Input the second number:");
//        int number2=s.nextInt();
//        System.out.println("Input the third number:");
//        int number3=s.nextInt();
//        if(number1+number2 ==number3){
//            System.out.println("the result is: true");
//        }else System.out.println("the result is: false");



        //Q6

//        System.out.println("Input a word:");
//        String word = s.nextLine();
//        StringBuilder str = new StringBuilder(word);
//        System.out.println("Revers the word:"+ str.reverse());


        //Q7

//        System.out.println("Enter a number:");
//        int number = s.nextInt();
//        if(number%2==0){
//            System.out.println("The number is Even");
//        }else System.out.println("The number is Odd");


        //Q8

//            System.out.println("Enter temperature in Centigrade:");
//            double temp = s.nextDouble();
//            System.out.println("Temperature in Fahrenheit is:"+(temp*9/5+32));


        //Q9

//        System.out.println("Input a string:");
//        String string = s.nextLine();
//        System.out.println("Input a number:");
//        int at = s.nextInt();
//        System.out.println(string.charAt(at));


        //Q10

//        double width = 5.6;
//        double height = 8.5;
//        System.out.println("Area is"+width+"*"+height+"="+(width*height));
//        System.out.println("Perimeter is 2*("+width+"+"+height+")="+(2*(width+height)));


        //Q11

//        System.out.println("Input first integer:");
//        int firstNum = s.nextInt();
//        System.out.println("Input second integer:");
//        int secondNum = s.nextInt();
//        if(firstNum == secondNum){
//            System.out.println(firstNum+"=="+secondNum);
//            System.out.println(firstNum+">="+secondNum);
//            System.out.println(firstNum+"<="+secondNum);
//        }else if(firstNum > secondNum){
//            System.out.println(firstNum+"!="+secondNum);
//            System.out.println(firstNum+">"+secondNum);
//            System.out.println(firstNum+">="+secondNum);
//        }else   System.out.println(firstNum+"!="+secondNum);
//                System.out.println(firstNum+"<"+secondNum);
//                System.out.println(firstNum+"<="+secondNum);


        //Q12

//        System.out.println("input seconds:");
//        int sec = s.nextInt();
//        int hour = sec/3600;
//        int min = (sec%3600)/60;
//        int sec1 = (sec%60);
//        System.out.println(hour+"/"+min+"/"+sec1);


        //Q13

//        System.out.println("Input first number:");
//        int firstInput = s.nextInt();
//        System.out.println("Input second number:");
//        int secondInput = s.nextInt();
//        System.out.println("Input third number:");
//        int thirdInput = s.nextInt();
//        System.out.println("Input forth number:");
//        int forthInput = s.nextInt();
//
//        if(firstInput == secondInput && firstInput==thirdInput && firstInput==forthInput){
//            System.out.println("Numbers are equal");
//        }else System.out.println("Numbers are not equal");


        //Q14
//        System.out.println("Input a number:");
//        int check = s.nextInt();
//        if(check >0){
//            System.out.println("Number is positive");
//        }else if (check <0){
//            System.out.println("Number is negative");
//        }else System.out.println("Number is zero");


        //Q15
//
//        int pos =0;
//        int neg =0;
//        int zero=0;
//        System.out.println("enter number or -1 to quit");
//        int x = s.nextInt();
//      while (x!=-1){
//
//          if(x>0){
//              pos++;
//          }else if (x<0){
//              neg++;
//          }else zero++;
//          x = s.nextInt();
//      }
//        System.out.println(pos+" positive numbers");
//        System.out.println(zero+" zero numbers");
//        System.out.println(neg+" negative numbers");


        //Q16

//        System.out.println("Input an integer");
//        int input1 = s.nextInt();
//        String revers = Integer.toString(input1);
//        for (int i = 0; i <=revers.length()-1 ; i++) {
//            System.out.print(revers.charAt(revers.length()-1-i));
//        }
//        System.out.println("");


        //Q17

//        System.out.println("please enter a number or f to quit");
//        String check1 = s.nextLine();
//        int great=0;
//        int small =0;
//       int y=0;
//        while(check1.equals("f")==false){
//        y=Integer.parseInt(check1);
//        if(y>great){
//            great =y;
//        }else if (y<small){
//            small =y;
//        }
//            System.out.println("please enter a number or f to quit");
//           check1 = s.nextLine();
//                }
//        System.out.println("the large number is:"+great);
//        System.out.println("the small number is:"+small);


        //Q18

        System.out.println("Enter string:");
        String str1 = s.nextLine();
        int count1 = 0;
        for (int i = 0; i <=str1.length()-1; i++) {
            if(str1.charAt(i)=='a'){
                count1++;
            }
        }
        System.out.println("numbers of a: "+count1);
    }
}