public class Compter extends TangibleAsset{
    private String makerName;

    public Compter(String name,int price,String color,String makerName){
        super (name,price,color);
        this.makerName = makerName;
    }

    public String getMakerName(){return this.makerName;}

}