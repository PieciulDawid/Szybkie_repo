package Models;

public enum AccessLevelType  {
	ADMIN(0),
	NOTADMIN(1);
	
	private final int num;
	
	AccessLevelType(int num) {
		this.num = num;
	}
}