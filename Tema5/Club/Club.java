package Tema5.Club;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    public static ArrayList<Membership> arrayMiembrosClub = new ArrayList<Membership>();
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        arrayMiembrosClub.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        int longitud=arrayMiembrosClub.size();
        return longitud;
    }
    
    public int joinedInMonth(int month){

        int contador=0;

        if (month>1 && month<12){
            for (Membership item : arrayMiembrosClub) {
                if(item.getMonth()==month){
                    contador++;
                }                
            }

        }else{
            System.out.println("El valor mes esta fuera de rango (1-12)");
        }
        return contador;
    }

    public int purge(int month){

        int eliminados=0;

        Iterator<Membership>it=arrayMiembrosClub.iterator();

        while(it.hasNext()){
            Membership user = it.next();

            if (user.getMonth()== month){
                arrayMiembrosClub.remove(user);
                eliminados++;
            }
        }
        return eliminados;
    }

}