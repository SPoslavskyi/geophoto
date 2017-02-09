package geophoto;



public class geophoto {

	public static void main(String[] args) {

        System.out.println("Photo georeferencing tool");
        //System.out.println(args.length);
        if (args.length==0) {
        	System.out.println("Usage message");//TODO Usage message
        } else
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        } 

	}


}
