package task1.service;
import task1.entity.Ball;
public class BallService {
    public double defineWeightBalls(Ball[] balls){
        double total = 0;

        for (int i = 0; i < balls.length; i++) {

            total += balls[i].getWeight();

        }
        return total;
    }
    public int findBallbyColor(Ball[] balls, String color){
        int total = 0;
        for (int i = 0; i < balls.length; i++) {

         if(balls[i].getColor().equals(color)){

             total++;

         }
        }
        return total;

    }
}
