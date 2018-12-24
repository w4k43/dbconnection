package sqlbuildertest;

class PsqlBuilder implements Builder{
	private Psql psql;
	
	public PsqlBuilder() {
		// TODO Auto-generated constructor stub
		this.psql = new Psql();
	}
	
	@Override
	public void url(String url) {
		psql.setUrl(url);
	}
	@Override
	public void user(String user) {
		psql.setUser(user);
	}
	@Override
	public void password(String password) {
		psql.setPassword(password);
	}
	@Override
	public Psql getResult() {
		return this.psql;
	}

}
