package task2312;

public class Room {

    private int width, height;
    private Snake snake;
    private Mouse mouse;
    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static void main(String[] args) {

        game = new Room(5,5,new Snake(4,6));
        game.snake.setDirection(SnakeDirection.DOWN);

    }

    void run() {
    }

    void print() {
    }
}
