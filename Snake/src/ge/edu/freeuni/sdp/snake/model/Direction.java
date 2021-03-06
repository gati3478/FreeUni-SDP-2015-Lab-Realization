package ge.edu.freeuni.sdp.snake.model;

public class Direction {

	// Note there is no Direction.NONE
	public static Direction LEFT = new Direction(-1, 0);
	public static Direction RIGHT = new Direction(1, 0);
	public static Direction UP = new Direction(0, -1);
	public static Direction DOWN = new Direction(0, 1);

	private int _dx;
	private int _dy;

	private Direction(int dx, int dy) {
		_dx = dx;
		_dy = dy;
	}

	public Point addTo(Point point) {
		return new Point(point.X + _dx, point.Y + _dy);
	}

	public boolean isOppositeTo(Direction other) {
		return (this == LEFT && other == RIGHT)
				|| (this == DOWN && other == UP)
				|| (other == LEFT && this == RIGHT)
				|| (other == DOWN && this == UP);
	}
}