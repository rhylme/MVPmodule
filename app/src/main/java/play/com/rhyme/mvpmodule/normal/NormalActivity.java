package play.com.rhyme.mvpmodule.normal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import play.com.rhyme.mvpmodule.simple.SimpleView;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public class NormalActivity extends AppCompatActivity implements SimpleView{
    public static final String TAG="NormalActivity";

    private NormalPresenter presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=new NormalPresenter();
        presenter.attachView(this);
        presenter.getNetData("normal");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
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
