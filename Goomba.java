public class Goomba extends Enemy {

    private boolean isFlat;

    public Goomba(int startingPosition) {
        super("a Goomba", startingPosition);
        isFlat = false;
    }

    public void stomp() {
        isFlat = true;
        kill();
    }

    public void draw() {
        if (isFlat) {
            // Graphics stuff draws a flat Goomba
            System.out.println("You see a flat Goomba at position " + getPosition());
        } else {
            // Graphics stuff draws a regular Goomba
            System.out.println("You see " + getName() + " at position " + getPosition());
        }
    }
}
