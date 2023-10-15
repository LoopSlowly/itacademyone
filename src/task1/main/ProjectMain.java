package task1.main;

import task1.entity.Ball;
import task1.service.BallService;

public class ProjectMain {
    public static void main(String[] args) {
        Ball ball = new Ball(2, "steel", "red", 5.2);
        Ball ball2 = new Ball(3, "iron", "grey", 2.7);
        Ball ball3 = new Ball(4, "rubber", "white", 2.1);
        Ball ball4 = new Ball(7, "iron", "green", 8.6);
        Ball ball5 = new Ball(1, "steel", "red", 4);

        Ball[] balls = new Ball[5];
        balls[0] = ball;
        balls[1] = ball2;
        balls[2] = ball3;
        balls[3] = ball4;
        balls[4] = ball5;

        for (int i = 0; i < balls.length; i++) {

            System.out.println(balls[i]);
        }

        BallService service = new BallService();
        double result = service.defineWeightBalls(balls);
        System.out.println("Sum weight = " + result);
        int resultColor;
        resultColor = service.findBallbyColor(balls, "red");
        System.out.println("red balls = " + resultColor);

    }
}
