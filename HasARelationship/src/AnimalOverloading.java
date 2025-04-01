 class AnimalOverloading {
}
 class MonkeyOverloading extends AnimalOverloading {
}

class Test{

        public void m1(AnimalOverloading a){
            System.out.println("animal version");
        }
        public void m1(MonkeyOverloading m){
            System.out.println("Monkey version");
        }
    public static void main(String[] args) {
        AnimalOverloading a=new AnimalOverloading();
        MonkeyOverloading m = new MonkeyOverloading();
        Test t1= new Test();
        t1.m1(a);
        t1.m1(m);
        t1.m1(null);
    }
}