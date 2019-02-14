package cwalsh.cs134.miracosta.edu.paintestimator.model;

/**
 * The <code>nteriorRoom</code>i class calculates the amount of paint needed to re-coat a room.
 *
 * @author Casey Walsh
 * @version 1.0
 */

public class InteriorRoom {

	private int mDoors;
	private int mWindows;
	private double mWidth;
	private double mHeight;
	private double mLength;

	/**
	 * Standard door area (3 feet x 7 feet)
	 */
	public static final double DOOR_AREA = 21.0;
	/**
	 *
	 */
	public static final double WINDOW_AREA = 16.0;
	/**
	 *
	 */
	public static final double SQ_FEET_PER_GALLON = 275.0;

	/**
	 * Instantiated a new <code>InteriorRoom</code> provided with the number of doors, windows
	 * and its dimensions: width, height and length.
	 * @param doors The number of doors in the room.
	 * @param windows The number of windows in the room.
	 * @param width The width of the room in feet.
	 * @param height The height of the room in feet.
	 * @param length The length of the room in feet.
	 */
	public InteriorRoom(int doors, int windows, double width, double height, double length) {
		mDoors = doors;
		mWindows = windows;
		mWidth = width;
		mHeight = height;
		mLength = length;
	}

	public int getDoors() { return mDoors; }
	public void setDoors(int doors) { mDoors = doors; }
	public int getWindows() { return mWindows; }
	public void setWindows(int windows) { mWindows = windows; }
	public double getWidth() { return mWidth; }
	public void setWidth(int width) { mWidth = width; }
	public double getHeight() { return mHeight; }
	public void setHeight(int height) { mHeight = height; }
	public double getLength() { return mLength; }
	public void setLength(int length) { mLength = length; }

	public double doorAndWindowArea() {
		return mDoors * DOOR_AREA + mWindows * WINDOW_AREA;
	}

	public double totalSurfaceArea() {
		return mHeight * 2.0 * (mWindows + mLength);
	}

	public double wallSurfaceArea() {
		return totalSurfaceArea() - doorAndWindowArea();
	}

	public double gallonsOfPaintRequired() {
		return wallSurfaceArea() / SQ_FEET_PER_GALLON;
	}

	@Override
	public String toString() {
		return "InteriorRoom{" +
				"mDoors=" + mDoors +
				", mWindows=" + mWindows +
				", mWidth=" + mWidth +
				", mHeight=" + mHeight +
				", mLength=" + mLength +
				'}';
	}
}
