package play.com.rhyme.mvpmodule.normal;

import play.com.rhyme.mvpmodule.simple.SimpleCallBack;
import play.com.rhyme.mvpmodule.simple.SimpleModule;
import play.com.rhyme.mvpmodule.simple.SimpleView;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public class NormalPresenter {
    private SimpleModule module;
    private SimpleView view;

   public NormalPresenter(){
        module=new SimpleModule();

    }
    public void attachView(SimpleView view){
        this.view=view;

    }

    public void detachView(){
        this.view=null;

    }
    public boolean isAtachView(){
        return this.view!=null;
    }

    public void getNetData(String params){
        module.getNetData(params, new SimpleCallBack() {
            @Override
            public void onSuccess(String data) {
                if (isAtachView()){
                    view.showdata(data);
                }
            }

            @Override
            public void onFailure(String msg) {
                if (isAtachView()){
                    view.showFailure(msg);
                }
            }

            @Override
            public void onError() {
                if (isAtachView()){
                    view.showError();
                }
            }

            @Override
            public void onComplete() {
                if (isAtachView()){
                    view.hideLoading();
                }
            }
        });
    }
}
