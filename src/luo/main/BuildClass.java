package luo.main;

public class BuildClass {
	String name;//名字
	float price;//价格
	
	public BuildClass (String name,float price) {
		this.name=name;
		this.price=price;
	}
    //重新定义输出格式
	public String toString() {
		return "name:"+name+";---price:"+price+"\n";
	}
	public static void main(String[] args) {
		BuildClass firstObj = new BuildClass("白菜",5.6f);
		BuildClass secondObj = new BuildClass("萝卜",10);
		BuildClass thirdObj = new BuildClass("牛肉",50);
		System.out.println(firstObj);
		System.out.println(secondObj);
		System.out.println(thirdObj);
	}

}
