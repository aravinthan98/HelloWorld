 interface contract {

    static void simcar(){

    }
    static void storage(){

    }
    static void screen(){

    }

}
class sumsung implements contract{
    static void simcar(){
        System.out.print("hello");
    }
    public static void main(String args[]){
        sumsung obj=new sumsung();
        obj.simcar();

    }
}