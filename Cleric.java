import java.util.Random;

public class Cleric{
    String name;
    int hp = 50;
    static int MAX_HP = 50;
    int mp = 10;
    static int MAX_MP = 10;

    void selfadd(){
        System.out.pritln(this.name+"はセルフエイドを唱えた");
        this.mp-=5;
        this.hp = this.Maxhp();
        System.out.println("HPが最大まで回復した");
    }

    void pray(int sec){
        System.out.println(this.name+"は"+sec+"秒間祈りを唱えた");
        int recover = new Random().nextInt(3)+sec;
        
        int recoverActuual = Math.min(this.Max_MP - this.mp, recover);
        this.mp+= recoverActual;
        System.out.println("MPが"+recoverActual+"回復した");
        return recoverActual;
    }

    Cleric(String name,int hp,int mp){
        this.name =name;
        this.hp=hp;
        this.mp=mp;
    }

    Cleric(String name,int hp){
       this(name,hp,Cleric.MAX_MP);
    }

    Cleric(String name){
        rhis(name,Cleric.MAX_HP,Cleric.MAX_MP);
    }

    

}