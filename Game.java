public class Game {

    private Enemy[] enemies;

    public static void main(String[] args) {
        Enemy[] enemies = {new Goomba(3),
                           new Goomba(4),
                           new Koopa(8),
                           new Goomba(10),
                           new Koopa(14)};
        Game theGame = new Game(enemies);
        theGame.run();
    }

    public Game(Enemy[] enemies) {
        this.enemies = enemies;
    }

    public void run() {
        for (int i = 0; i < 3; ++i) {

            // Update game state
            for (Enemy enemy: enemies) {
                enemy.moveOnce();
            }

            // Draw graphics
            for (Enemy enemy: enemies) {
                enemy.draw();
            }
            System.out.println();
        }
    }
}
