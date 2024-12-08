package bilibili.src.pt12.a04Exception;

public class NameFormatException extends RuntimeException{

    //自定义异常

    public NameFormatException(String message) {
        super(message);
    }

    public NameFormatException() {
    }
}
