public class LazyIni {
    public static LazyIni ref = null;

   private LazyIni(){

    }

    public static LazyIni getLazyIni(){
        if(ref==null){
            ref = new LazyIni();
        }
        return ref;
    }

    public static void main(String[] args) {
        LazyIni lz = LazyIni.getLazyIni();
        System.out.println(lz);
    }
    
}
