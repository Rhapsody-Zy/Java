package bilibili.src.pt12.a04Exception;

public class AgeOutOfBoundException extends RuntimeException{
    public AgeOutOfBoundException() {
    }

    public AgeOutOfBoundException(String message) {
        super(message);
    }
}
