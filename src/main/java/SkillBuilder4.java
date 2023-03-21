/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants

    public static String findTYPattern(String s)
    {
        String i = s.toLowerCase();
        int t = i.indexOf('t');
        int y = i.indexOf('y');
        if(y > t) return s.substring(t,y+1);
        return "";
    }
}
