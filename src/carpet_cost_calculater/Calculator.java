package carpet_cost_calculater;

public class Calculator {
    //instance variable
    Floor floor;
    Carpet carpet;

    //constructor with parameter
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    //get method
    public double getTotalCost(){
      return floor.getArea()* carpet.getCost();
    }

}
