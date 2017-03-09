package brainatwork.pattern.architectural.mvp;

public interface IContract {
	
	interface ActionListener{
		void performAction();
	}
	
	interface IView{
		void updateView();
	}
}
