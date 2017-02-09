package geophoto;



public class geophoto {

	static String evfn = "";		//Events file name
	static String trfn = "";		//GPS track file name
	
	public static void main(String[] args) {

        System.out.println("Photo georeferencing tool started...");
        //System.out.println(args.length);
        if (args.length==0) {
        	System.out.println("Usage message");//TODO Usage message
        } else
        for(int i = 0; i < args.length; i++) {
        	if (args[i].equals("-ef")) {
        		evfn=args[++i];
        		System.out.println("Event file:"+evfn);
        	}
        	if (args[i].equals("-tf")) {
        		evfn=args[++i];
        		System.out.println("Track file:"+trfn);
        	}
        	//System.out.println("arg:"+args[i]);	
        } 
        //System.out.println(evfn);
	}


}
