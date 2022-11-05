package kr.co.ezenac.abstractClass;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Desktop();
		computer.display();
		computer.typing();
		computer.turnOn();
		computer.turnOff();
		
		System.out.println();
		
		NoteBook myNote = new MyNoteBook();
		myNote.display();
		myNote.typing();
		myNote.turnOn();
		myNote.turnOff();
	}

}
