package kimdaeheon_assignment;

public interface Skinnable {
	
	// »ö±òº° »ó¼ö
	public static final int BLACK  = 0;
	public static final int RED    = 1;
	public static final int GREEN  = 2;
	public static final int BLUE   = 3;
	public static final int YELLOW = 4;
	
	// changeSkin
	public abstract void changeSkin(int skin);

	// printSkin
	public abstract void printSkin();
}
