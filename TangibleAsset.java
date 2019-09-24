public abstract class TangibleAsset extends Asset implements Thing{
    private double weight;
    private String color;


public TangibleAsset(String name,int price,String color){
    super(name,price);
    this.color=color;
}

public String getColor(){return this.color;}
public double getWeight(){return this.weight;}
public void setWeight(double weight){this.weight=weight;}
}