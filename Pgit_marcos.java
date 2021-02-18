/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pgit_marcos;

/////
public class Pgit_marcos {

    public static void main(String[] args) {
   
        int day=13, month=9, year=2021;
        String stDat=birth(day,month,year);
        
        System.out.println("international "+stDat+" sep2021");
        //
    }
    
    
    private static String birth(int day, int month, int year){
        
        
        
        String[] ArrayWeek = {"Sunday", "Monday","Monday","Monday","Monday","Monday","Monday"};
        
        int a, y, m, d;
        
        a=(14 - month) / 12;
        
        y= year -a;
        m= month + 12 * a-2;
        d=(day + y + y / 4 - y / 100 + y / 400 + (31 *m) / 12) %7;
        d= (day+ y+y/4-y/100+y /400 + (31*m)/12)%7;
             
        
    return ArrayWeek[d];
    
    }}
    

