package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshs
 */
public class TestUserprofile {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //UserProfile user = new UserProfile("","");
        
        System.out.println("What is your name?: ");
        
        String userId = input.nextLine();
        
        System.out.println("What is your favourite genre?\n Comedy, Drama, Action, Mystery. (Please type one)");
        
        String userGenre = input.nextLine();
        
        System.out.println("Your profile is complete");
        
        UserProfile user = new UserProfile(userId,userGenre);
        
        System.out.println("Your name is " + user.getUserID() + "and your favourite genre is " + user.getGenre());
                     
               
               
    }
        
}
