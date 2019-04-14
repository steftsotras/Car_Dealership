//ASKHSH 1
//Tsotras Stefanos icsd13189
package auto;

/**
 *
 * @author Stefanos
 */
public class Car {
    
    //DHLWSH METAVLHTWN
    private int code;
    private String company;
    private String model;
    private int HP;
    private int cubism;
    private int price;
    private String color;
    
    //YLOPOIHSH CONSTRUCTOR
    public Car(String company,String model,int HP,int cubism,int price,String color){
        
        this.company=company;
        this.model=model;
        this.HP=HP;
        this.cubism=cubism;
        this.price=price;
        this.color=color;
    }
    
    //SETS KAI GETS
    public void setCompany(String company){
        this.company=company;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setHP(int HP){
        this.HP=HP;
    }
    public void setCubism(int cubism){
        this.cubism=cubism;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setCode(int code){
        this.code=code;
    }
    
    public String getCompany(){
        return company;
    }
    public String getModel(){
        return model;
    }
    public int getHP(){
        return HP;
    }
    public int getCubism(){
        return cubism;
    }
    public int getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public int getCode(){
        return code;
    }
    
}
