import java.util.Scanner;
/**
 * 여기에 RobotTest 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class RobotTest
{
     public static void main(String[] args){
        double speed = 5.0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("교통신호는 :");
        String color = scanner.nextLine();
    
        Robot robot = new Robot();
        System.out.println(robot.setRobotwalk(color,speed) + "km/h");
    }
}
