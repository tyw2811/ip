package catbot.exception;

/**
 * An empty task exception for the CatBot chatbot which extends from CatBotException.
 */
public class EmptyTaskException extends CatBotException {

    /** The command that threw the exception. */
    private String cmd;

    /**
     * Constructor for an EmptyTaskException.
     *
     * @param cmd The command that threw the exception.
     */
    public EmptyTaskException(String cmd) {
        this.cmd = cmd;
    }

    /**
     * Returns the string representation of the EmptyTaskException object.
     *
     * @return The string representation of the EmptyTaskException object.
     */
    @Override
    public String toString() {
        return super.toString() + " The " + this.cmd + " task is empty! Please add the task description :)";
    }
}
