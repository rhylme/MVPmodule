package play.com.rhyme.mvpmodule.simple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import play.com.rhyme.mvpmodule.R;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public class SimpleActivity extends AppCompatActivity implements SimpleView {
    public static final String TAG = "SimpleActivity";

    SimplePresenter simplePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        simplePresenter = new SimplePresenter(this);
        simplePresenter.getData("normal");
    }

    @Override
    public void showLoading() {
        Log.d(TAG,"showLoading");
    }

    @Override
    public void hideLoading() {
        Log.d(TAG,"hideLoading");

    }

    @Override
    public void showdata(String data) {
        Log.d(TAG,"data"+data);

    }

    @Override
    public void showFailure(String msg) {
        Log.d(TAG,"msg"+msg);

    }

    @Override
    public void showError() {
        Log.d(TAG,"showError");
    }
}
