package program3;

public class RethrowException {
	public static void getStringLength(){
        try{
            String text = null;
            int length = text.length();
        }catch(Exception e){
            System.out.println("Caught exception : "+e.toString());
            throw e;
        }
    }
    
    public static void main(String[] args) {
        try{
            getStringLength();
        }catch(Exception e){
            System.out.println("Caught re-thrown exception : "+e.toString());
        }
    }
}
