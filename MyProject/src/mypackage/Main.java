package mypackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    	String readFile = "./src/mypackage/originalFile.txt";
    	String writeFile = "./src/mypackage/resultFile.txt";
    	
    	ArrayList<String> list = new ArrayList<>();
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(readFile))) {
    		String line;
    		while ((line = br.readLine()) != null ) {
    			list.add(line);
    		}
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    	Collections.sort(list);
    	
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile))) {
    		for (String line : list) {
    			bw.write(line);
    			bw.newLine();
    		}
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}