class Chat {
    boolean flag = false;

    public synchronized void sendText(String msg) {
        if (flag) {
            try {
                wait();
                // ? Why does the wait() call have a warning?
            } catch (InterruptedException e) {
                e.printStackTrace();
                // ? Why does this catch block have a warning?
            }
        }
        System.out.println("Person-1: " + msg);
        flag = true;
        notify();
        // ? Why does using notify() over here lead to a warning?
    }

    public synchronized void sendReply(String msg) {
        while (!flag) {
            try {
                // * ANSWER
                /**
                 * When waiting upon a Condition, a "spurious wakeup" is permitted to occur, in
                 * general, as a concession to the underlying platform semantics.
                 */
                wait();
            } catch (InterruptedException e) {
                // * ANSWER
                /**
                 * InterruptedExceptions should never be ignored in the code, and simply logging
                 * the exception counts in this case as "ignoring". The throwing of the
                 * InterruptedException clears the interrupted state of the Thread, so if the
                 * exception is not handled properly the fact that the thread was interrupted
                 * will be lost.
                 */
                e.printStackTrace();
                Thread.currentThread().interrupt(); // restore interrupted state
            }
        }
        System.out.println("Person-2: " + msg);
        flag = false;
        notifyAll();
        // * ANSWER
        // notify and notifyAll both wake up sleeping threads, but notify only
        // rouses one, while notifyAll rouses all of them. Since notify might not wake
        // up the right thread, notifyAll should be used instead.
    }
}

class Person1 implements Runnable {
    Chat personalChat;
    String[] messages = { "Hi😀", "Just checking up on you. How are you?", "I am also doing fine.😁" };

    public Person1(Chat personalChat) {
        this.personalChat = personalChat;
        new Thread(this, "Question").start();
    }

    public void run() {
        for (int i = 0; i < messages.length; i++) {
            personalChat.sendText(messages[i]);
        }
    }
}

class Person2 implements Runnable {
    Chat personalChat;
    String[] messages = { "Hi!🙌", "I am good.👌 What about you?", "Cool!👍" };

    public Person2(Chat personalChat) {
        this.personalChat = personalChat;
        new Thread(this, "Answer").start();
    }

    public void run() {
        for (int i = 0; i < messages.length; i++) {
            personalChat.sendReply(messages[i]);
        }
    }
}

public class ChatThreadSafetyDemo {
    public static void main(String[] args) {
        Chat justAChat = new Chat();
        new Person1(justAChat);
        new Person2(justAChat);
    }
}
