import java.util.Scanner;


/**
 * @author jobv
 */

public class Movie {
    // 1. Name
    // 2. Select the movie
    // 3. Select seats
    // 4. Print ticket

    static Scanner scan = new Scanner(System.in);
    static String name;
    static String[] movielist = {"1) Cruella" , "2) The Conjuring: The Devil Made Me Do It" , "3) Fast and Furious 9" , "4) Raya and the Last Dragon" , "5) Tom and Jerry" , "6) Spider-Man: No Way Home"};
    static int number;

    public static void getName(){
        System.out.println("What's your name?");
        name=scan.nextLine();
        System.out.println("Welcome "+name+"!");
        getMovie(); 
    }

    // We are using a - for - in order to get the whole movie list
    // When we use the movielist[number-1] is because we want to print starting the first letter of the movie tittle, if not, is going to print since the number of the movie
    // Because we don't want to print the numeral of the movie, we are using the substring(args0, arg1) and we are count spaces to start with the 1st letter, in this case 3 spaces.


    public static void getMovie(){
        System.out.println("What Movie do you want to watch?");
        for(int i=0;i<movielist.length;i++){
            System.out.println(movielist[i]);    
        }
        number=scan.nextInt();
        System.out.println("You selected the movie: "+movielist[number-1].substring(3, movielist[number-1].length()));
        getSeats();
    }

    public static void getSeats(){
        System.out.println("How many seats do you want?");
        String seats=scan.next();
        System.out.println("Great! \nYou have selected "+seats+" seat(s) for the movie: "+movielist[number-1].substring(3, movielist[number-1].length()));
    } 
    public static void main(String []args){
        
        getName();
    }
}