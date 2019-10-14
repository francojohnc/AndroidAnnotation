package co.startidea.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import co.startidea.annotation.BindView;
import co.startidea.annotation.OnClick;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding.bind(this);
    }

    @OnClick(R.id.bt_1)
    void buttonOneClick(View v) {
        tvContent.setText("Button 1 Clicked");
    }

    @OnClick(R.id.bt_2)
    void buttonTwoClick(View v) {
        tvContent.setText("Button 2 Clicked");
    }
}
