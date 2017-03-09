package brainatwork.pattern.architectural.mvp;

import brainatwork.pattern.architectural.mvp.IContract.IView;
import brainatwork.pattern.architectural.mvp.IContract.ActionListener;

public class Main{
	

		
	public static void main(String[] argv){
		
		//view implementation
		IContract.IView mView = new MyView();
		
		//In this case main function performs the action. Suppose a click on update button.
		IContract.ActionListener mPresenter = new Presenter(mView);
		mPresenter.performAction();
	}
	


}
