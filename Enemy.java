public class Enemy {

    private String name;
    private int direction; // +1 for right, -1 for left
    private int position;
    private boolean isAlive;

    public Enemy(String name, int startingPosition) {
        this.name = name;
        this.direction = -1;
        this.position = startingPosition;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public int getDirection() {
        return direction;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int newPosition) {
        position = newPosition;
    }

    public void kill() {
        isAlive = false;
    }

    public void stomp() {
        kill();
    }

    public void moveOnce() {
        this.position += direction;
    }
    
    // Draws the monster on the screen
    public void draw() {
        // Graphics stuff draws the enemy at its position
        System.out.println("You see " + name + " at position " + position);
    }
}
