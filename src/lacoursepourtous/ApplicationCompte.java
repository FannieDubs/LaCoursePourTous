/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoursepourtous;

import entites.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author BTS sio
 */
public class ApplicationCompte {
    
//déclaration des attributs de la classe
   
    
    
//création du constructeur
    public ApplicationCompte(String numCompte,String User){
        
       // User unUser = unUser;
        
    }
    
    // Méthode pour créer un utilisateur.
    
    public  static User createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--\nQuel est votre nom ?");
        String nom = sc.nextLine();
        System.out.println("Quel est votre prénom ?");
        String prenom= sc.nextLine();
        System.out.println("Quelle est votre adresse mail ?");
        String mail = sc.nextLine();
        System.out.println("Entrez vorte mot de passe ?");
        String mdp= sc.nextLine();
        

        User unUser = new User(nom, prenom, mail, mdp);
        return unUser;
    }
    
    public static void afficherUser(User user){
        System.out.println("Nom : "+ user.getNom());
        System.out.println("Prénom : "+ user.getPrenom());
        System.out.println("Adresse Mail : "+ user.getMail());
        System.out.println("Mot de Passe : "+ user.getMdp());
        
    }
    
            
    //méthode statique de test unitaire 
    public static void main(String[] args){
           User user = createUser();
           System.out.println(user.getNom());
           
           ApplicationCompte.afficherUser(user);

        //User user1= new User("dupond", "jhon", "adbc@gmail.com", "motdepasse1");
        //System.out.println("l'utitisateur 1 est :" + user1.getPrenom()+" "+ user1.getNom());
        
        
        //comment créer un dictionnaire clé, valeur 
        /* Map<String, Integer> compte = new HashMap<>();
            compte.put("User", 1);
            compte.put("User2", 2);
            compte.put("User3", 25);
            
            System.out.println(compte.toString());
            
            for(Entry<String, Integer> element: compte.entrySet()){
                System.out.println("la clé est :"+ element.getKey()+" , et la valeur est : "+ element.getValue());
            }*/
        
        
    }
    
    
}
