import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Driver {
	
    /** 
     * main class
     * @param args the command line arguments
     */
	
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
        
    	Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();
        Server objServer = new Server(); 
        objServer.start();
        Client objClientSending = new Client("sending");
        objClientSending.start();
        Client objClientReceiving = new Client("receiving");
        objClientReceiving.start();
        if(objNetwork.getInBufferStatus() == "empty") {
        	
        }
        
        if(objNetwork.getOutBufferStatus() == "empty") {
        	
        }

        /* Complete here the code for the main method ...*/
    }
}
