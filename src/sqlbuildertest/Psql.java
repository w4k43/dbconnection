package sqlbuildertest;

class Psql {
	// psqlの接続情報を持っているクラス
	private String url;
	private String user;
	private String password;
	
	public void setUrl(String url) {
		this.url = url	;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUrl() {
		return this.url;
	}
	public String getUser() {
		return this.user;
	}
	public String getPassword() {
		return this.password;
	}

}
