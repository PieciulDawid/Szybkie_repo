package Models;

public enum AccessLevelType  {
	ADMIN(0),
	NOADMIN(1);
	
	private final int num;
	
	AccessLevelType(int num) {
		this.num = num;
	}
}