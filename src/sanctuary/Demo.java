package sanctuary;
import sanctuary.Sanctuary;


public class Demo {
    public static void main(String[] args){
        Sanctuary model = new Sanctuary();
        JFrameView view = new JFrameView("Sanctuary Application");
        SancController controller = new SancController(view,model);
    }
}
