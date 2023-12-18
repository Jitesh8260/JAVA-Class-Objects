import java.util.Scanner;

class DisplaySatelites{
    public static void main(String[] args) {
        String s[]=new String[]{"moon"};
        Planet p1=new Planet("earth",s);
        p1.print();
    }
}
class Planet{
    String name;
    String [] satelites ;
    Planet(String n,String[] x){
         this.name=n;
         this.satelites = x;
    }
    void print( ){
        System.out.println(name+" has "+satelites.length+" satelite(s) ");
         for(String satellite : satelites) {
            System.out.println(satellite);
    }
}
}










