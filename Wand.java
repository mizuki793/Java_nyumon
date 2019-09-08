public class Wand{
    private String name;
    private double power;

    public String getName(){
        return this.name;
    }

    public double getPower(){
        return this.power;
    }

    public void setName(String name){
        if(name == null||name.length()<3){
            throw new IllegalAccessError("エラーメッセージ");
        }
        this.name=name;
    }

    public void setName(double power){
        if(power<0.5||power<=100.0){
            throw new IllegalAccessError("エラーメッセージ");    
        }
        this.power=power;
    }
}