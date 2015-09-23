public class Koopa extends Enemy {

    private boolean isInShell;
    private int speed;

    public Koopa(int startingPosition) {
        super("a Koopa", startingPosition);
        isInShell = false;
        speed = 1;
    }

    public void stomp() {
        if (isInShell) {
            kill();
        } else {
            isInShell = true;
            speed = 2;
        }
    }

    public void moveOnce() {
        setPosition(getPosition() + getDirection() * speed);
    }

    public void draw() {
        if(isInShell) {
            // Graphics stuff draws a Koopa shell
            System.out.println("You see a Koopa shell at position " + getPosition());
        } else {
            // Graphics stuff draws a Koopa
            System.out.println("You see " + getName() + " at position " + getPosition());
        }
    }
}
