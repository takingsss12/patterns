package brainatwork.pattern.creationl.builder;

public class Main {
	public static void main(String[] argv){
		NutritionalFacts n = new NutritionalFacts.Builder().sodium(10).carbo(15).
				fat(5).build();
	}
}
