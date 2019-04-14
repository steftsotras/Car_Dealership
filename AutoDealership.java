//ASKHSH 1
//Tsotras Stefanos icsd13189
package auto;
import java.util.*;
/**
 *
 * @author Stefanos
 */
public class AutoDealership {
    
    //DHLWSH METAVLHTWN
    private ArrayList<Car> exhibition;
    private Random rand;
    private int randomcode;
    private boolean flag;
    private int counter;
    private ArrayList<String> company;
    private int i;
    private ArrayList<Integer> tempHP;
    
    //CONSTRUCTOR
    public AutoDealership(){
        
        exhibition= new ArrayList<Car>();
        rand = new Random();
        randomcode=0;
        company = new ArrayList<String>();
        tempHP = new ArrayList<>();
        
        InsertCarsManually();
        
    }
    
    //EISAGWGH AYTOKINHTWN STH LISTA
    public void InsertCarsManually(){
        
        Car c1 =new Car("Toyota","Yaris",75,1300,4300,"black");
        Car c2 =new Car("Suzuki","Jimny",85,1328,6300,"grey");
        Car c3 =new Car("Audi","A3",115,1600,15000,"white");
        Car c4 =new Car("Toyota","Avensis",132,1600,12000,"black");
        Car c5 =new Car("Subaru","Impreza",330,25000,18000,"blue");
        Car c6 =new Car("Audi","TT",211,2000,13000,"black");
        
        ExhibitionInput(c1);
        ExhibitionInput(c2);
        ExhibitionInput(c3);
        ExhibitionInput(c4);
        ExhibitionInput(c5);
        ExhibitionInput(c6);
        
    }
    
    //METHODOS EISAGWGHS AUTOKINHTOU STHN EKTHSESH
    public void ExhibitionInput(Car car){
        
        //OTAN MPENEI GIA PRWTH FORA GIA
        //TO SUGKEKRIMENO ANTIKEIMENO TOTE
        //VAZW ENA TUXAIO TRIPSIFIO
        if(randomcode == 0){
            randomcode = 100+rand.nextInt(899);
            car.setCode(randomcode);
            exhibition.add(car);
            System.out.println("To autokinhto kataxwrithike epituxws me kwdiko : "+car.getCode()+"\n");
            company.add(car.getCompany().toUpperCase());
        }
        else{ //ALLIWS
            
            //ATELEIWTO LOOP
            while(true){
                
                //TIMH TOU TUXAIOU KWDIKOU
                randomcode = 100+rand.nextInt(899);
                
                //PSAKSIMO STH LISTA
                for(i=0;i<exhibition.size();i++){
                    //AN O KWDIKOS UPARXEI BGENEI KAI DEN PSAXNEI TA UPOLOIPA
                    if(exhibition.get(i).getCode() == randomcode){
                        break;
                    }
                }
                //AN OI LOOPES EINAI ISES ME TO MEGETHOS THS LISTAS
                //DHLADH DEN VRIKE POUTHENA STH LISTA TON KWDIKO
                if(i == exhibition.size()){
                    
                    //TOTE TO PERNAEI STHN LISTA
                    car.setCode(randomcode);
                    exhibition.add(car);
                    System.out.println("To autokinhto kataxwrithike epituxws me kwdiko : "+car.getCode()+"\n");
                    
                    //TSEK GIA ANANEWSH THS LISTAS ME TIS MARKES
                    for(i=0;i<company.size();i++){
                        //AN H MARKA YPARXEI TOTE VGENEI APTO LOOP
                        if(car.getCompany().equalsIgnoreCase(company.get(i))){
                            break;
                        }
                    }
                    
                    //AN DEN GINEI BREAK TOTE PROSTHETW THN MARKA STH LISTA
                    if(i == company.size()){
                        company.add(car.getCompany().toUpperCase());
                    }
                    
                    //KAI TELOS VGENEI APTHN WHILE
                    break;
                } 
            }      
        } 
    }
    
    //METHODOS DIAGRAFHS APTH LISTA MESW KWDIKOU
    public void DeleteCar(int code){
        
        //PSAKSIMO STH LISTA
        for(i=0;i<exhibition.size();i++){
            //AN VRETHEI O KWDIKOS DIAGRAFETAI TO ANTIKEIMENO
            //KAI VGENEI APTHN FOR
            if(exhibition.get(i).getCode() == code){
                exhibition.remove(i);
                System.out.println("To autokinhto diagrafthike me epituxia\n\n");
                return;
            }
        }
        //AN OI LOOPES EINAI ISES ME TO MEGETHOS THS LISTAS
        //DHLADH DEN VRIKE POUTHENA STH LISTA TON KWDIKO
        //EMFANIZETE ANALOGO MYNHMA
        if(i == exhibition.size()){
            System.out.println("Den vrethike autokinhto me auton ton kwdiko\n\n");
        }
    }
    
    //METHODOS PSAKSIMATOS AYTOKINHTOU STH LISTA MESW KWDIKOU
    public void SearchCar(int code){
        
        //PSAKSIMO STH LISTA
        for(i=0;i<exhibition.size();i++){
            //AN VRETHEI O KWDIKOS EMFANIZONTAI TA STOIXEIA TOU AYTOKINHTOU
            //KAI VGENEI APTHN FOR
            if(exhibition.get(i).getCode() == code){
                
                System.out.println("Kwdikos autokinhtou : "+exhibition.get(i).getCode());
                System.out.println("Marka : "+exhibition.get(i).getCompany());
                System.out.println("Modelo : "+exhibition.get(i).getModel());
                System.out.println("Aloga : "+exhibition.get(i).getHP());
                System.out.println("Kubismo : "+exhibition.get(i).getCubism());
                System.out.println("Timh : "+exhibition.get(i).getPrice());
                System.out.println("Xrwma : "+exhibition.get(i).getColor()+"\n");
                
                break;
            }
        }
        //AN OI LOOPES EINAI ISES ME TO MEGETHOS THS LISTAS
        //DHLADH DEN VRIKE POUTHENA STH LISTA TON KWDIKO
        //EMFANIZETE ANALOGO MYNHMA
        if(i == exhibition.size()){
            System.out.println("Den vrethike autokinhto me auton ton kwdiko\n\n");
        }
    }
    
    //METHODOS EMFANISHS MARKWN AUTOKINHTOU POU YPARXOYN STH LISTA
    public void ViewExhibitionComp(){
        
        System.out.println("Markes autokinhtwn pou einai diathesimes sthn ekthesh :\n\n");
        for(i=0;i<company.size();i++){
            System.out.println(company.get(i)+"\n");
        }
    }
    
    //METHODOS EMFANISHS MEGALYTERHS KAI MIKROTERHS IPPODYNAMHS
    public void StatsHP(){
        
        
        
        //AN H LISTA EXEI MONO ENA STOIXEIO
        if(exhibition.size() == 1){
            System.out.println("Yparxei mono ena autokinhto  : ");
            SearchCar(exhibition.get(0).getCode());
        }
        else{
            
            //PRWTO STOIXEIO TIS LISTAS MIN KAI MAX
            int max= exhibition.get(0).getHP(), min= exhibition.get(0).getHP();
            int maxi=0,mini=0;
            
            //APO TO DEUTERO MEXRI TO TELEUTAIO STOIXEIO THS LISTAS
            for(i=1;i<exhibition.size();i++){

                //AN TO MAX EINAI MIKROTERO APTO TWRINO STOIXEIO
                //TOTE MAX GINETE TO STOIXEIO
                if(exhibition.get(i).getHP() > max){
                    max = exhibition.get(i).getHP();
                    maxi=i;
                }
                //ALLIWS AN EINAI MIKROTERO TOU MIN
                //TOTE MIN GINETE TO STOIXEIO
                else if(exhibition.get(i).getHP() < min){
                    min = exhibition.get(i).getHP();
                    mini=i;
                }
            }
        
            //EMFANISH MEGALYTERHS KAI MIKROTERHS IPPODYNAMHS
            System.out.println("Autokinhto me thn megaluterh ippodunamh : ");
            SearchCar(exhibition.get(maxi).getCode());
            System.out.println("Autokinhto me thn mikroterh ippodunamh : ");
            SearchCar(exhibition.get(mini).getCode());
        
        }
        
    }
    
    //METHODOS EMFANISHS MEGALYTERHS KAI MIKROTERHS IPPODYNAMHS ANA MARKA
    public void StatsHPperCompany(){
           
        //GIA OLES TIS MARKES POU EINAI DIATHESIMES
        for(int j=0;j<company.size();j++){    
            
            //PSAXNW MESA STHN EKTHESH
            for(int k=0; k<exhibition.size();k++){
                
                //AN VREI THN MARKA TOTE
                if(exhibition.get(k).getCompany().equalsIgnoreCase(company.get(j))){
                    //VAZEI THN IPPODUNAMH TOU AUTOKINHTOU STHN 
                    //PROSWRINH LISTA
                    tempHP.add(exhibition.get(k).getHP());
                    
                }
                
            }
            
            System.out.println("Gia Marka "+company.get(j));
            
            //KATHORISMOS KAI EMFANISH MIN MAX SUMFWNA ME THN 
            //PROSWRINH LISTA POU APOTHIKEUTIKAN OI IPPODUNAMEIS 
            //MIAS SUGKEKRIMENHS MARKAS
            
            //PRWTO STOIXEIO TIS LISTAS MIN KAI MAX
            
            
            //AN H LISTA EXEI MONO ENA STOIXEIO
            if(tempHP.size() == 1){
                System.out.println("Yparxei mono ena autokinhto me ippodunamh : ");
                for(int p=0; p<exhibition.size();p++){
                    if(tempHP.get(0) == exhibition.get(p).getHP()){
                        SearchCar(exhibition.get(p).getCode());
                    }
                }
                
            }
            else{
                
                int max= tempHP.get(0), min= tempHP.get(0);
                int maxi=0,mini=0;
                
                //APO TO DEUTERO MEXRI TO TELEUTAIO STOIXEIO THS LISTAS
                for(i=1;i<tempHP.size();i++){

                    //AN TO MAX EINAI MIKROTERO APTO TWRINO STOIXEIO
                    //TOTE MAX GINETE TO STOIXEIO
                    if(tempHP.get(i) > max){
                        max = tempHP.get(i);
                        maxi=i;
                    }
                    //ALLIWS AN EINAI MIKROTERO TOU MIN
                    //TOTE MIN GINETE TO STOIXEIO
                    else if(tempHP.get(i) < min){
                        min = tempHP.get(i);
                        mini=i;
                    }
                }
                
                for(int p=0; p<exhibition.size();p++){
                
                    if(tempHP.get(maxi) == exhibition.get(p).getHP()){
                        System.out.println("Autokinhto me thn megaluterh ippodunamh : ");
                        SearchCar(exhibition.get(p).getCode());
                    }
                    else if(tempHP.get(mini) == exhibition.get(p).getHP()){
                        System.out.println("Autokinhto me thn mikroterh ippodunamh : ");
                        SearchCar(exhibition.get(p).getCode());
                    }
                
                }
                
                
            
            }
            //DIAGRAFH OLWN TWN STOIXEIWN THS LISTAS
            tempHP.clear();
        }
           
            
    }
    
    //METHODOS EMFANISHS PLITHOUS AYTOKINITWN ANA MARKA
    public void ViewCarperCompany (){
        
        int counter=0;
        
        //GIA OLES TIS MARKES POU EINAI DIATHESIMES
        for(int j=0;j<company.size();j++){    
            
            //PSAXNW MESA STHN EKTHESH
            for(int k=0; k<exhibition.size();k++){
                
                //AN VREI THN MARKA TOTE
                if(exhibition.get(k).getCompany().equalsIgnoreCase(company.get(j))){
                    //AYKSANEI TON COUNTER
                    counter++;
                    
                }
                
            }
            
            //EMFANISH APOTELESMATOS
            System.out.println("Gia Marka "+company.get(j));
            System.out.println(counter+"\n");
            
            counter = 0;
        }        
        
    }
    
    //METHODOS EMFANISHS TIMH ANALOGA ME THN PROTHMISH TOU XRHSTH
    public void ViewCarPrice (int price, int epilogh){
        
        //AN O XRHSTHS EPELEKSE 1
        if(epilogh == 1){
            
            System.out.println("Autokinta me timh megaluterh apo "+price);
            
            //EMFANISH TWN AYTOKINHTWN ME MEGALYTERH TIMH
            for(i=0;i<exhibition.size();i++){
                
                if(price < exhibition.get(i).getPrice()){
                    
                    SearchCar(exhibition.get(i).getCode());
                    
                }
                
            }
            
        }
        else{
            
            System.out.println("Autokinta me timh mikroterh apo "+price);
            
            //EMFANISH TWN AYTOKINHTWN ME MIKROTERH TIMH
            for(i=0;i<exhibition.size();i++){
                
                if(price > exhibition.get(i).getPrice()){
                    
                    SearchCar(exhibition.get(i).getCode());
                    
                }
                
            }
        }
        
    }
    
    
}
