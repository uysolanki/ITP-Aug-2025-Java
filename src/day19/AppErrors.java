package day19;

public enum AppErrors
{

	ERR1("ERR-01","%s is an Invalid Username"),
	ERR2("ERR-01","Invalid Password");
	
	private String errorCode;
	private String errorMessage;
	
	private AppErrors(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
