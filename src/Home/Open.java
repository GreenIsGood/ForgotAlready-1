package Home;
import Ready.Ready;
import EasyLevel.EasyLevel;
import MediumLevel.MediumLevel;
import HardLevel.HardLevel;
import HowToPlay.HowToPlay;
import ScenarioProfessor.ScenarioProfessor;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Open extends Thread{  
    public static String open = "";
    public static Open t1;
    
    @Override
    public void run(){  
        switch (open) {
            case "0":
                Ready.main(null);
                break;
            case "1":
        {
            try {
                EasyLevel.frame = null;
                EasyLevel.frame = new EasyLevel();
                EasyLevel.main(null);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
            }
                            break;
        }
            case "2":
        {
            try {
                MediumLevel.frame = null;
                MediumLevel.frame = new MediumLevel();
                MediumLevel.main(null);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "3":
        {
            try {
                HardLevel.frame = null;
                HardLevel.frame = new HardLevel();
                HardLevel.main(null);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "how":
                HowToPlay.frame = null;
                HowToPlay.frame = new HowToPlay();
                HowToPlay.main(null);
                break;
            default:
                ScenarioProfessor.main(null);
                break;
        }
    }  
    
    public static void main(String args[]){  
        t1=new Open();  
        t1.start();
    }  

}