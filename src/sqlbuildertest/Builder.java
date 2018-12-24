package sqlbuildertest;

interface Builder {
	void url(String url);
	void user(String user);
	void password(String password);
	
	Psql getResult();
}
