package StrategyDesingPatern;

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	//Instead of using an interface in a traditional way
	// we use an instance variable that is a subclass of Flys interface
	//Animal doesnt care about flyTyoe, but behavior of subclass
	
	//This is known as Composition : Instead of inheriting an abilitiy through inheritence the class is compesed
	// with Objects with the right ability
	
	//Composition allows you to change the capabilities of object at run time
	public Flys flyingType;

	
	public void setName(String newName){ name = newName; }
    public String getName(){ return name; }

    public void setHeight(double newHeight){ height = newHeight; }
    public double getHeight(){ return height; }
/**
 * 
 * @param newWeight 
 */
    public void setWeight(int newWeight){
    	if(newWeight > 0) {
    		weight = newWeight;
    		
    	}else {
    		System.out.println("Weight must be bigger than 0");
    	}
    }
    
    public double getWeight(){ return weight; }
    
    public void setFavFood(String newFavFood){ favFood = newFavFood; }
    public String getFavFood(){ return favFood; }
    
    public void setSpeed(double newSpeed){ speed = newSpeed; }
    public double getSpeed(){ return speed; }
    
    public void setSound(String newSound){ sound = newSound; }
    public String getSound(){ return sound; }



    public String tryToFly(){
    	return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
    	flyingType = newFlyType;

    }
}
