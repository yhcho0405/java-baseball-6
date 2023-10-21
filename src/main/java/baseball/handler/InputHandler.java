package baseball.handler;

import camp.nextstep.edu.missionutils.Console;
import baseball.validator.InputValidator;

public class InputHandler {

    private final OutputHandler outputHandler = new OutputHandler();
    private final InputValidator inputValidator = new InputValidator();

    public String askUserInputNumber() {
        outputHandler.printInputRequestMessage();
        String input = Console.readLine();
        inputValidator.checkInputNumber(input);

        return input;
    }

    public boolean askRestart() {
        outputHandler.printAskGameRestartMessage();
        String input = Console.readLine();
        inputValidator.checkRestartInput(input);

        return "1".equals(input);
    }
}
