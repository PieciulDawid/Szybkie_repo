package Models;

public enum StateType {
	ACCEPTED(0),
	INPROGRESS(1),
	FINALISED(2),
	CANCELED(3);
	
	private final int num;
	
	StateType(int num) {
		this.num = num;
	}
}