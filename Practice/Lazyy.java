public class Lazyy {

    public static Lazyy lz = null;
    private Lazyy(){
        System.out.println("created object successfully...!!!");
    }

    public static Lazyy getLazyy(){
        
        if(lz==null){
            lz = new Lazyy();
        }
        System.out.println("inistialized successfully...!!!");
        return lz;
    }
    public static void main(String[] args) {

        Lazyy l = Lazyy.getLazyy();
        System.out.println(l);
        
        
    }
}
