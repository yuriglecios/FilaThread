import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Implementacao extends Thread{

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaThread = new ConcurrentLinkedQueue<ObjetoFilaThread>();
    public static void add(ObjetoFilaThread ObjetoFilaThread){
        pilhaThread.add(ObjetoFilaThread);
    }

    @Override
    public void run() {
        Iterator iterator = pilhaThread.iterator();
        while (iterator.hasNext()){
            ObjetoFilaThread processar = (ObjetoFilaThread) iterator.next();// recebe o o jeto atual e abaixo processa ele

            // nesse ponto é onde ficará nossa rotina e que será processada nesse while
            //após ela ser executada o iterator irá tirar ela da fila para que ele não a repita

            iterator.remove();
            // esse sleep fará o descarrego de memória para o sistema
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
