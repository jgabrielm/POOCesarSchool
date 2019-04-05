package exemplos.aula07;

@SuppressWarnings("unused")
public class ReusoConstrutor {
	
	private int x;
	private String a;
	private double y;
	private double z;
	
	public ReusoConstrutor() {
		this.x = 10;
	}
	
	public ReusoConstrutor(double y, double z) {
		this();
		this.y = y;
		this.z = z;
	}
	
	public ReusoConstrutor(double y, double z, String a) {
		this(y,z);
		this.a = a;
	}
	
	public static void main(String[] args) {
		ReusoConstrutor reuso1 = new ReusoConstrutor();
		ReusoConstrutor reuso2 = new ReusoConstrutor(10.5, 0.5);
		ReusoConstrutor reuso3 = new ReusoConstrutor(10.5, 0.5, "");
	}
}
