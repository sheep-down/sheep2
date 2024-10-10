package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       /* int a=0;
         for(int i=0;i<=50;i++)
       {

           if(i%7==0&&i!=0){
               System.out.print(i);
               System.out.print(" ");
               a++;
           }
           if (a==5){
              break;
           }
        }*/
       /* int i=0;
        while (i<51){
            int a=0;
            if(i%7==0){
                System.out.print(i);
                System.out.print(" ");
                a++;
            }
            i++;
            if(a==5){
                break;
            }
        }
*/

  /*      System.out.println("输入需要逆序的数字:");
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        while(num!=0){
            System.out.print(num%10);
            num=num/10;
        }
    }*/

   /*     for(int i=0;i<6;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }*/

                int n = 5;
                for(int i =0; i <=n; i++){
                    for(int j = 0; j <= n-i; j++){
                        System.out.print(" ");
                    }
                   for(int j=0;j<2*i-1;j++){
                       System.out.print("x");
                   }
                    System.out.println();
                }

            }
        }
