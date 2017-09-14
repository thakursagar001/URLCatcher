import java.net.*;
import java.io.*;

public class UrlRead {
    public static void main(String[] args) throws Exception {
    	String currentLine;
    	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Acer\\Desktop\\jyoti\\url.txt"));
    	back:while(( currentLine = br.readLine())!=null){
    		URL myURL = new URL(currentLine);
    		URLConnection myURLConnection = myURL.openConnection();
            	myURLConnection.connect();
                BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream())); 
                String input="";
                String inputLine;
                while ((inputLine = in.readLine()) != null)
                    input = input + inputLine;
                String currentSport;
                BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\Acer\\Desktop\\jyoti\\file.txt"));
                while((currentSport=br1.readLine())!=null){
                    if((input.contains(currentSport))|| (currentLine.contains(currentSport))){
                       	System.out.println(currentSport);
                       	continue back;
                    }
                }
                    
                br1.close();
                System.out.println("NA");
    	}
    	br.close();
    }
}