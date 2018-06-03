/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitsum;

/**
 *
 * @author Sudhanshu
 */
public class DigitSum {
        public static int digitSum(int num){
        int result=0;
            while(num!=0){
                result+=num%10;
                num/=10;
            }
            if(result>9)
                result = digitSum(result);
        return result;
        }  
    public static void main(String args[]){
        int number=976592;
        int res;
        res = digitSum(number);
        System.out.println(res);
    }
}
