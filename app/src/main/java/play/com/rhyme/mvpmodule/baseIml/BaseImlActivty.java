package play.com.rhyme.mvpmodule.baseIml;

import android.os.Bundle;
import android.support.annotation.Nullable;

import play.com.rhyme.mvpmodule.base.BaseActivity;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public class BaseImlActivty extends BaseActivity implements BaseImlView{
    private BaseImlPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=new BaseImlPresenter();
        presenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void showOther(String data) {

    }
}
