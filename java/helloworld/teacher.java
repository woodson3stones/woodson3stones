public class teacher extends people implements my_interface {
	private String profession;
	public teacher(){
		super();
		profession="teacher";
	}
	public teacher(String name ,int old,String profession){
		super(name,old);
		this.profession=profession;
	}
	public void show(){
		//super.show();
		System.out.println("i am a teacher!!!");
		System.out.println("profession:"+profession);
	}
	public void teach(){
		//super.show();
		System.out.println("dear student,please convey yourself");
	}
	public void get_married(){
		System.out.println("i am happy because i get married !");
	}
}