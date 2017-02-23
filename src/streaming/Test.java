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
        int numVid = 0;
        int numEP = 0;
        int numRD;
        int numCache;


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
                   // pizzaPie = new Pizza(rows, columns, ingredients, maxSlice);
                    System.out.println("number of Videos " +numVid+ "videos");
                    firstLine = false;
                } else {
                    
                    for (int i = 0; i < token.length(); i++) {
                        
                        
                        }
                    }
                }
                            line = br.readLine(); // next line

            }
            
        }catch(IOException e){
            
        }
        

        
    }
    
}
