package proxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main (String[] args) 
    { 
        Internet internet = new ProxyInternet(); 
        try
        { 
            internet.connectTo("hasan.khattak.info"); 
            internet.connectTo("nust.edu.pk"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 

}

class ProxyInternet implements Internet 
{ 
    private Internet internet = new RealInternet(); 
    private static List<String> bannedSites; 
      
    static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("nust.edu.pk"); 
        bannedSites.add("comsats.edu.pk"); 
        bannedSites.add("cust.edu.pk"); 
        bannedSites.add("nu.edu.pk"); 
    } 
      
    @Override
    public void connectTo(String serverhost) throws Exception 
    { 
        if(bannedSites.contains(serverhost.toLowerCase())) 
        { 
            throw new Exception("Access Denied"); 
        } 
          
        internet.connectTo(serverhost); 
    } 
  
}

class RealInternet implements Internet 
{ 
    @Override
    public void connectTo(String serverhost) 
    { 
        System.out.println("Connecting to "+ serverhost); 
    } 
} 

interface Internet 
{ 
    public void connectTo(String serverhost) throws Exception; 
} 