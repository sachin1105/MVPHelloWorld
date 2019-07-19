package technology.provue.com.gitoperation.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import technology.provue.com.gitoperation.R;
import technology.provue.com.gitoperation.contract.MainActivityContract;
import technology.provue.com.gitoperation.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private MainActivityContract.Presenter mPresenter;

    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initWidgets() {

        mTextView = (TextView)findViewById(R.id.mTextView);
        mButton = (Button) findViewById(R.id.mButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPresenter.onClick(v);
            }
        });



    }

    @Override
    public void displayMessage(String message) {

        mTextView.setText(message);
    }


}//end of Activity
