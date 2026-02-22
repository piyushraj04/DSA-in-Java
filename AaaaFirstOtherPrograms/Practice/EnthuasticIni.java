public class EnthuasticIni {
    private EnthuasticIni(){

    }

    private static EnthuasticIni ref = new EnthuasticIni();
    public static EnthuasticIni gEnthuasticIni(){
        if(ref!=null){
            return ref;
        }
        return new EnthuasticIni();
    }
    public static void main(String[] args) {
        EnthuasticIni ref = EnthuasticIni.gEnthuasticIni();
        System.out.println(ref);
    }
}
