package luo.main;

public class BuildClass {
	String name;//����
	float price;//�۸�
	
	public BuildClass (String name,float price) {
		this.name=name;
		this.price=price;
	}
    //���¶��������ʽ
	public String toString() {
		return "name:"+name+";---price:"+price+"\n";
	}
	public static void main(String[] args) {
		BuildClass firstObj = new BuildClass("�ײ�",5.6f);
		BuildClass secondObj = new BuildClass("�ܲ�",10);
		BuildClass thirdObj = new BuildClass("ţ��",50);
		System.out.println(firstObj);
		System.out.println(secondObj);
		System.out.println(thirdObj);
	}

}
