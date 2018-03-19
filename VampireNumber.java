//vampire number 吸血鬼数字
public class VampireNumber {
	public static void main(String[] args) {
		int[] startDigit = new int[4];
        int[] productDigit = new int[4];       
             for(int num1 = 11; num1 <= 99; num1++)
               for(int num2 = (1000 / num1) > num1 ? 1000 / num1 : num1; num2 <= 99; num2++) {  
                 // 从11开始，若num2初始值设为11，则会产生过多运算，故用1000/num1
               	 // 从32开始 1000/num1开始小于num1，此时num2初值设为num1，提升效率的同时避免了重复
                 // Pete Hartley's theoretical result:
                 // If x·y is a vampire number then
                 // x·y == x+y (mod 9)
                 if((num1 * num2) % 9 != (num1 + num2) % 9)
                   continue;
                 int product = num1 * num2;
                 startDigit[0] = num1 / 10;
                 startDigit[1] = num1 % 10;
                 startDigit[2] = num2 / 10;
                 startDigit[3] = num2 % 10;
                 productDigit[0] = product / 1000;
                 productDigit[1] = (product % 1000) / 100;
                 productDigit[2] = product % 1000 % 100 / 10;
                 productDigit[3] = product % 1000 % 100 % 10;
                 int count = 0;
                 for(int x = 0; x < 4; x++)
                   for(int y = 0; y < 4; y++) {
                     if(productDigit[x] == startDigit[y]) {
                       count++;
                       productDigit[x] = -1;
                       startDigit[y] = -2;
                       if(count == 4)
                       	System.out.println(num1 + " * " + num2
                       + " : " + product);
                   }
               }
           }
	}
}