public class Hero{
	String name;
	private int hp;
	static int money;

	public String getName(){
		return this.name;
	}

	public void  setName(String name){
		if(name == null){
			throw new IllegalArgumentException("nullが設定されている。処理中断");
		}

		if(name.length()<=1){
			throw new IllegalArgumentException("文字が少ない。処理中断");
		}

		if(name.length()>=8){
			throw new IllegalArgumentException("名前が長すぎる。処理中断");
		}
		this.name =name;
	}

	void bye(){
		System.out.println("勇者は別れを告げた");
	}

	void sleep() {
		this.hp =100;
		System.out.println(this.name+"は眠って回復した!");
	}
	
	void sit(int sec) {
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"眠って回復した!");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	
	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ!");
		System.out.println("5のダメージ");
	}

	void run(){
		System.out.println(this.name+"は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp+"でした");
	}

	private void die(){
		System.out.println(this.name+"は死んでしまった");
		System.out.println("GameOverです");
	}

	public void attack(Matango m){
		System.out.println("お化けキノコ"+m.suffix+"から2ptの攻撃を受けた");
		this.hp -=2;
	}

	Hero(String name){
		this.hp =100;
		this.name = name;	
	}

	Hero(){
		this("ダミー");

	}

	static void setRandomMoney(){
		Hero.money =(int)(Math.random()*1000);
	}
	
	
	
}