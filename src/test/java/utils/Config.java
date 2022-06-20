package utils;

public class Config {
	private String baseUrl;
	private String loginUrl;
	private String username;
	private String password;
	private String browser;
	private int PollingDuration;
	private int Timeoutforwait;
	
	
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	
	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}
	
	public String getLoginUrl() {
		return loginUrl;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	public String getBrowser() {
		return browser;
	}
	
	public void setPollingDuration(int pollingduration) {
		this.PollingDuration = pollingduration;
	}
	
	public int getPollingDuration() {
		return PollingDuration;
	}
	
	public void setTimeoutForWait(int timeoutforwait) {
		this.Timeoutforwait = timeoutforwait;
	}
	
	public int getTimeoutForWait() {
		return Timeoutforwait;
	}

}
