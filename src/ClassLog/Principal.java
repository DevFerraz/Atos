package ClassLog;
import java.util.logging.Level;

public class Principal {
    public static void main(String[] args) {
        try{
            Log meuLogger = new Log("Log.txt");
            //meuLogger.logger.setLevel(Level.SEVERE);
            meuLogger.logger.info("Log de informação");
            meuLogger.logger.warning("Log de aviso");
            meuLogger.logger.severe("Log severo");
        } catch (Exception ignored){

        }
    }
}
