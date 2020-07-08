package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("./src/txt/input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        try{
            String string = br.readLine();
            String[] input = string.split(" ", 0);
        
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);

            String fb = "FB ";
            String f = "F ";
            String b = "B ";

            for(int i = 1; i <= N ;i++){
                if(i%A == 0 && i%B == 0){
                    System.out.print(fb);
                }else if(i%A == 0){
                    System.out.print(f);
                }else if(i%B == 0){
                    System.out.print(b);
                }else{
                    System.out.print(i+"");
                }
            }
            System.out.println("");
        }finally{
            br.close();
        }
    }
}