
/**
 * 여기에 Robot 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Robot
{
    private String color;
    private double speed;
    
    // public double getSpeed(){
        // return this.speed;
    // }
    
    // public String getcolor(){
        // return this.color;
    // }
    
    public double setRobotwalk(String color,double speed){
        this.speed = speed;
        this.color = color;
         if((color.equals("green"))){
        }
        else
        {
            if(color.equals("yellow")){
               speed = speed*1.2;
            }
            else
            {
                speed = 0;
            }
        }
        return speed;
    }
}
