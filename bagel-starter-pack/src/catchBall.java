import bagel.*;
import java.lang.*;
import java.util.*;
import java.text.DecimalFormat;

public class catchBall extends AbstractGame {
    private Image player,ball;
    private Point playerPos, ballPos;
    private Font conform = new Font("res/conformable.otf",24);
    private static DecimalFormat df = new DecimalFormat("0.00");
    private int score=0;
    private final double[] arr = {1.0,-1.0};
    private Point randomDir = new Point(this.arr[(int)Math.round(Math.random())],this.arr[(int) Math.round(Math.random())]);

    public catchBall() {
        super(800,600,"CatchBall");
        player = new Image("res/player.png");
        ball = new Image("res/ball.png");
        playerPos = new Point(200,350);
        ballPos = new Point((Math.random()*800),Math.random()*600);
    }

    public static void main(String[] args) {
        catchBall game = new catchBall();
        game.run();
    }

    @Override
    public void update(Input input) {
        final double STEP_SIZE = 1;
        final double ball_step = 0.5;

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

//      # random direction
//        Point random = ballPos.getDirection(new Point(Math.random()*800,Math.random()*600));
//
//        ballPos.setX(ballPos.getX()+random.getX()*STEP_SIZE);
//        ballPos.setY(ballPos.getY()+random.getY()*STEP_SIZE);

        if (ballPos.getX() <= 0 | ballPos.getX() >= 800) {
            randomDir.setX(randomDir.getX()*-1);
        }
        if (ballPos.getY() <= 0 | ballPos.getY() >= 600) {
            randomDir.setY(randomDir.getY()*-1);
        }

        // random diagonal direction
        ballPos.setX(ballPos.getX()+randomDir.getX()*STEP_SIZE);
        ballPos.setY(ballPos.getY()+randomDir.getY()*STEP_SIZE);
        ball.draw(ballPos.getX(), ballPos.getY());
        conform.drawString(String.format("Score: %d",score), 32,32);

        if (playerPos.distanceTo(ballPos) <= 20 ) {
            conform.drawString("Great Job!",32,60);
            ballPos = new Point(Math.random()*800,Math.random()*600);
            score++;
        }
    }
}
