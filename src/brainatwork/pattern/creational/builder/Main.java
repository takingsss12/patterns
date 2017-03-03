package brainatwork.pattern.creational.builder;
//
public class Main {
	public static void main(String[] argv){
		NutritionalFact n = new NutritionalFact.Builder().sodium(10).carbo(15).fat(5).build();
	}
}
