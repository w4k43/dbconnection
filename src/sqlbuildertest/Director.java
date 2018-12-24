package sqlbuildertest;

class Director {
	private Builder builder; 
	
	Director (Builder builder) {
		this.builder = builder;
	}
	
	void construct() {
		builder.url("jdbc:postgresql://localhost:5432/postgres");
		builder.user("waka");
		builder.password("");
	}
}
