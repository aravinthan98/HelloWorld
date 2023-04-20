package opps;

public class sample {
    public static void main(String[] args) {
        String coour="red";
        int tyre=4;
        int airbag=6;
        String engine="bs6";
        String keysrart="on";
        boolean hybrid=true;
        Car obj=new Car(coour,tyre,airbag,engine,keysrart,hybrid);



       System.out.print(obj.getTyre());



    }
}
class Car{
    String colour;
    int tyre;
    int airbag;
    String engine;
    String keysrart;
    boolean hybrid;
    Car(){

    }
    Car(String c,int t,int a,String e,String k,boolean h){
        this.colour=c;
        this.tyre=t;
        this.airbag=a;
        this.engine=e;
        this.keysrart=k;
        this. hybrid=h;
    }
    int getTyre(){
        return this.tyre;
    }
}
class BMW extends Car{
    BMW(String c,int t,int a,String e,String k,boolean h){
        super(c,t,a,e,k,h);
    }

}
class Audi{
    Audi(String c,int t,int a,String e,String k,boolean h){

    }

}
class benze{
    benze(String c,int t,int a,String e,String k,boolean h){

    }

}
