package sqlbuildertest;

class ExecuteSql {
	public static void main(String[] args) {
		Builder builder = new PsqlBuilder();
		Director director = new Director(builder);
	}

}
