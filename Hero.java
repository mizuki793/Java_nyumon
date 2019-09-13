public class Hero{
	private String name ="ミナト";
	private int hp = 100;


public String  getName(){	
	return this.name;
}

public void setName(String name){
	this.name=name;
}

public final void slip(){
	this.hp-=5;
	System.out.println(this.getName()+"転んだ");
	System.out.println("5のダメージ");
}
public void run(){
	System.out.println(this.getName()+"は逃げ出した");
	
}
}
