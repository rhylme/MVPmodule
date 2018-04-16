package play.com.rhyme.mvpmodule.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showdata(Object data) {

    }

    @Override
    public void showFailure(String msg) {

    }

    @Override
    public void showError() {

    }
}
