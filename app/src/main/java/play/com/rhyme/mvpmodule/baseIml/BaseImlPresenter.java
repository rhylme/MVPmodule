package play.com.rhyme.mvpmodule.baseIml;

import play.com.rhyme.mvpmodule.base.BasePresenter;
import play.com.rhyme.mvpmodule.base.BaseView;
import play.com.rhyme.mvpmodule.simple.SimpleCallBack;
import play.com.rhyme.mvpmodule.simple.SimpleModule;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public class BaseImlPresenter extends BasePresenter<BaseImlView> {
    private SimpleModule module;

    public BaseImlPresenter() {
        module=new SimpleModule();
    }

    public void getNetData(String params){
        if (!isAtachView()){
            return;
        }
        getView().showLoading();
        module.getNetData(params, new SimpleCallBack() {
            @Override
            public void onSuccess(String data) {
                if (isAtachView()){
                    getView().showdata(data);
                }
            }
            @Override
            public void onFailure(String msg) {
                if (isAtachView()){
                    getView().showFailure(msg);
                }
            }
            @Override
            public void onError() {
                if (isAtachView()){
                    getView().showError();
                }
            }
            @Override
            public void onComplete() {
                if (isAtachView()){
                    getView().hideLoading();
                }
            }
        });
    }
}
