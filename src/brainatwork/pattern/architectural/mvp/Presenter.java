package brainatwork.pattern.architectural.mvp;

public class Presenter implements IContract.ActionListener {
	
	private IContract.IView mView;
	
	public Presenter(IContract.IView view){
		mView = view;	
	}
	
	@Override
	public void performAction() {
		mView.updateView();
	}

}
