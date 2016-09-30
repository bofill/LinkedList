import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args){

		LinkedList<TrainCar> carList = new LinkedList<TrainCar>();
		carList.add(new TrainCar ("car1", "cargo1"));
		carList.add(new TrainCar ("car2", "cargo2"));
		carList.add(new TrainCar ("car3", "cargo3"));
		carList.add(new TrainCar ("car4", "cargo4"));
		carList.add(new TrainCar ("car5", "cargo5"));
		carList.add(new TrainCar ("car6", "cargo6"));
		carList.add(new TrainCar ("car7", "cargo7"));
		carList.add(new TrainCar ("car8", "cargo8"));

		printList(carList);

	}

	public static void printList(LinkedList<TrainCar> carList){
		System.out.println("CAR NAME\tCARGO");
		//iterates through the list
		Iterator<TrainCar> iter = carList.iterator();
		//the linkedlist util ckecks for next list
		while (iter.hasNext()){
			System.out.print(iter.next());
		}
	}
}

