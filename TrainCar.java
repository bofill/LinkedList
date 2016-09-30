

public class TrainCar {
	private String name;
	private String cargo;

	
	public TrainCar(String name, String cargo) {
		this.name = name;
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return name +  "\t\t" + cargo + "\n";
	}

}
	