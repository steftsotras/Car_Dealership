//ASKHSH 1
//Tsotras Stefanos icsd13189
package auto;

import java.util.Scanner;

/**
 *
 * @author Stefanos
 */
public class Auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //DHMIOURGIA ANTIKEIMENOU ANTIPROSWPIAS
        AutoDealership f1 = new AutoDealership();
        
        
        Scanner sc = new Scanner(System.in);

        int action;
        String cont = "y";
        
        //MENU EPILOGWN
        while(cont.equals("y"))
        {
            System.out.println("  Main Menu \nPress 1 to 7 to select one of the following \n1.Insert a Car \n2.Delete or Search a car with code"
            + "\n3.Show every car company available \n4.View car with most and least horsepower  \n5.View car with most and least horsepower per company "
            + "\n6.View number of cars per company \n7.View cars cheaper or more expensive than a price");
            action = sc.nextInt();
            
            switch(action)
            {
                case 1:
                    
                    //DIAVASMA IDIOTITWN APTO XRHSTH
                    System.out.println("Enter car company");
                    String company = sc.nextLine();
                    company = sc.nextLine();
                    System.out.println("Car model");
                    String model = sc.nextLine();
                    System.out.println("Color");
                    String color = sc.nextLine();
                    System.out.println("HP");
                    int hp = sc.nextInt();
                    System.out.println("Cubism");
                    int cub = sc.nextInt();
                    System.out.println("Price");
                    int price = sc.nextInt();
                    
                    //KAI EISAGWGH STH LISTA
                    f1.ExhibitionInput(new Car(company,model,hp,cub,price,color));

                    break;
                case 2:
                    
                    //EPILOGH APTO XRHSTH
                    System.out.println("Press 1 to Search OR 2 to Delete");
                    int inp = sc.nextInt();
                    //EISAGWGH KWDIKOU
                    System.out.println("Insert the code of the car");
                    int code = sc.nextInt();
                    
                    //KALESMA KATALLHLHS SYNARTHSHS ANALOGA ME THN EPILOGH
                    if(inp == 1){
                        f1.SearchCar(code);
                    }
                    else{
                        f1.DeleteCar(code);
                    }
                    
                    break;
                case 3:
                    
                    f1.ViewExhibitionComp();
                    break;
                case 4:
                    
                    f1.StatsHP();
                    break;
                case 5:
                    
                    f1.StatsHPperCompany();
                    break;
                case 6:
                    
                    f1.ViewCarperCompany();
                    break;
                case 7:
                    
                    //EPILOGH APTO XRHSTH
                    System.out.println("Press 1 for price less than input OR 2 for price more than input");
                    int input = sc.nextInt();
                    //EISAGWGH TIMHS
                    System.out.println("Insert the price");
                    int pr = sc.nextInt();
                    
                    f1.ViewCarPrice(pr, input);
                    break;
                default:
                    System.out.println("Choose a number between 1 and 7");
                    break;
            }
            
            String scanner_flush = sc.nextLine();
            
            System.out.println("Press any character to quit, or 'y' to continue");
            cont = sc.nextLine();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
