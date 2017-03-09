package brainatwork.pattern.architectural.mvp;


public class MyView implements IContract.IView {

	@Override
	public void updateView() {
		System.out.println("View updated");
		
	}

}
