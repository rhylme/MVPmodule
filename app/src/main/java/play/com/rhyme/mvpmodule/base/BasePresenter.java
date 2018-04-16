package play.com.rhyme.mvpmodule.base;

import android.view.View;

import play.com.rhyme.mvpmodule.simple.SimpleCallBack;
import play.com.rhyme.mvpmodule.simple.SimpleModule;
import play.com.rhyme.mvpmodule.simple.SimpleView;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public class BasePresenter<V extends BaseView> {
    private V view;
    public void attachView(V view){
        this.view=view;
    }
    public void detachView(){
        this.view=null;
    }
    public boolean isAtachView(){
        return this.view!=null;
    }

    protected V getView(){
        return view;
    }
}
