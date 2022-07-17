package singleton;

/**
 *
 * @author arnoldpaye
 */
public class ResourceManager {
  public static void main(String[] args) {
    PrintSpooler spooler = PrintSpooler.getInstance();
    System.out.print(spooler);
  }
}
