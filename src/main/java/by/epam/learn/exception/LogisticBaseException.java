package by.epam.learn.exception;

public class LogisticBaseException extends Exception {
	private static final long serialVersionUID = 1L;

	public LogisticBaseException() {
	}

	public LogisticBaseException(String message) {
		super(message);
	}

	public LogisticBaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public LogisticBaseException(Throwable cause) {
		super(cause);
	}
}
