class A{
    int a=10;
    static int b=20;
    public static void main(String[] args){
        A r=new A();
        r.display();
        A. show();
    }
    static void show(){
        System.out.println("show()" +b);
    }
    void display(){
        System.out.println(a+" "+b);
    }
}