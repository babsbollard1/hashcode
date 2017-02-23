/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
/**
 *
 * @author x00116788
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File outFile = new File("files", "me_at_the_zoo_out.txt");
        File inFile = new File("files", "me_at_the_zoo.txt");
        String line, token, delimiter = " ";
        StringTokenizer tokenizer;
        boolean firstLine = true;
        int numVid, numEP, numRD,numCache, cacheSize;
        int vidarr[] = {20,11,50,26,5,3,6,32,40,22,4,20,50,27,49,44,1,37,35,27,14,33,6,
            22,23,48,44,14,26,9,46,44,15,32,31,8,39,27,39,27,1,17,1,47,44,42,16,3,44,48,
            5,25,4,39,39,7,24,28,14,44,22,11,27,37,11,16,50,33,22,26,7,12,17,30,12,12,4,
            32,12,46,43,4,12,34,11,7,47,29,24,40,41,10,5,22,22,24,37,34,50,5};
        int sum = 0;
        for (int i = 0; i < vidarr.length; i++) {
           while(sum < 6000){
               sum+=vidarr[i];
           }
            
        }



        BufferedReader br = null;
        try{
            String sCurrentLine;            
            br = new BufferedReader(new FileReader(inFile));
            line = br.readLine();
            while (line != null) { // doesn't seem to start from first line
            tokenizer = new StringTokenizer(line, delimiter); 
            while (tokenizer.hasMoreTokens()) {// process tokens in line
                token = tokenizer.nextToken();
                if (firstLine) {
                    numVid = Integer.parseInt(token);
                    token = tokenizer.nextToken();
                    numEP = Integer.parseInt(token);
                    token = tokenizer.nextToken();
                    numRD = Integer.parseInt(token);
                    token = tokenizer.nextToken();
                    numCache = Integer.parseInt(token);
                    token = tokenizer.nextToken();
                    cacheSize = Integer.parseInt(token);
                   // pizzaPie = new Pizza(rows, columns, ingredients, maxSlice);
                    System.out.println("number of Videos " +numVid+ "videos");
                    System.out.println("number of caches" + numCache);
                    System.out.println("cache size" + cacheSize);
                    firstLine = false;
                } else {
                    
                    for (int i = 0; i < token.length(); i++) {
                        
                        
                        }
                    }
                line = br.readLine(); // next lin
                }
                            
            }
            
        }catch(IOException e){
            
        }
        

        
    }
    
}
