package technology.provue.com.gitoperation.contract;

public interface MainActivityContract {

    interface View{

        void initWidgets();
        void displayMessage(String message);

    }

    interface Model{

        String generateMessage();
    }

    interface Presenter{

        void onClick(android.view.View view);

    }

}
