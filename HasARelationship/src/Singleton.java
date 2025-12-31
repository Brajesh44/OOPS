public class Singleton {

    private static Singleton soleInstance = null;

    private Singleton(){
        System.out.println("Singleton object is creating ");
    }

    public static Singleton getSoleInstance(){
        if (soleInstance==null){
            return soleInstance=new Singleton();
        }
        else {
            return soleInstance;
        }
    }

    public static void main(String[] args) {
        Singleton s1= Singleton.getSoleInstance();
        Singleton s2= Singleton.getSoleInstance();

        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());

        // Check if both instances are the same
        if (s1 == s2) {
            System.out.println("Both objects are the same instance");
        } else {
            System.out.println("Different instances (Singleton failed)");
        }
    }
}
