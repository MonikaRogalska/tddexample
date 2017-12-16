package pl.sda.exaples.odd;

public class CanNotWithdrawMoreExeption extends RuntimeException {

    public CanNotWithdrawMoreExeption(String message) {
        super(message);
    }
}

