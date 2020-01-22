/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rscombd
 */
public class Trips {
     public String tripid;
     public String travelclass;
     public String price;
     public String departuredate;
     public String departurelocation;
     public String arrivallocation;
     public String transitlocation;
     public String transittimel;
     public String A_lic;
     public String estimatedtraveltime;
     //public int seats;
     public int cprice;
     
     public Trips(String a,String b,String c, String d, String e,String f,String g,String h,String i,String j,int n)
     {
         this.tripid = a;
         this.travelclass = b;
         this.price = c;
         this.departuredate=d;
         this.departurelocation=e;
         this.arrivallocation = f;
         this.transitlocation=g;
         this.transittimel=h;
         this.A_lic=i;
         this.estimatedtraveltime=j;
         //this.seats = m;
         this.cprice = n;
     }       


    
}
