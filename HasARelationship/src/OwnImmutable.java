
public final class OwnImmutable{

    private int i;

    private OwnImmutable(int i){
        this.i=i;
    }

    public OwnImmutable modify(int i){

        if (this.i==i)
        {return this;

        }
        else{
            return (new OwnImmutable(i));
        }
    }

    public static void main(String[] args)
    {
        OwnImmutable t1=new OwnImmutable(10);
        OwnImmutable  t2=t1.modify(100);
        OwnImmutable  t3=t1.modify(10);
        System.out.println(t1==t2);
        System.out.println(t1==t3);

    }
}