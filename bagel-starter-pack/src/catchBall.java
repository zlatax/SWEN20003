import bagel.*;
import java.lang.*;
import java.text.DecimalFormat;

public class catchBall extends AbstractGame {
    private Image player,ball;
    private Point playerPos, ballPos;
    private Font conform = new Font("res/conformable.otf",24);
    private static DecimalFormat df = new DecimalFormat("0.00");


    public catchBall() {
        super(800,600,"CatchBall");
        player = new Image("res/player.png");
        ball = new Image("res/ball.png");
        playerPos = new Point(200,350);
        ballPos = new Point(650,180);
    }

    public static void main(String[] args) {
        catchBall game = new catchBall();
        game.run();
    }

    @Override
    public void update(Input input) {
        final int STEP_SIZE = 1;

        if (input.isDown(Keys.LEFT)) {
            playerPos.setX(playerPos.getX() - STEP_SIZE);
        }
        if (input.isDown(Keys.RIGHT)) {
            playerPos.setX(playerPos.getX()+STEP_SIZE);
        }
        if (input.isDown(Keys.UP)) {
            playerPos.setY(playerPos.getY()-STEP_SIZE);
        }
        if (input.isDown(Keys.DOWN)) {
            playerPos.setY(playerPos.getY()+STEP_SIZE);
        }

        if (input.wasPressed(Keys.ENTER)) {
            Point dir = playerPos.getDirection(ballPos);
            playerPos.setX(playerPos.getX()+dir.getX()*STEP_SIZE);
            playerPos.setY(playerPos.getY()+dir.getY()*STEP_SIZE);
            System.out.println(df.format(playerPos.getX())+","+df.format(playerPos.getY()));
        }

        if (input.wasPressed(Keys.ESCAPE)) {
            Window.close();
        }

        player.draw(playerPos.getX(), playerPos.getY());
        ball.draw(ballPos.getX(), ballPos.getY());

        if (playerPos.distanceTo(ballPos) <= 20 ) {
            conform.drawString("Great Job!",32,32);
        }
    }
}
