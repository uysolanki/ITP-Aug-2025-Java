package day21;

public class LowQuantityException extends RuntimeException
{

		private String message;

		public LowQuantityException(String message) {
			super(message);
		}
		
		
}
