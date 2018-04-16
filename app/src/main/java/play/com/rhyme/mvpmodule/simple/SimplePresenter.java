package play.com.rhyme.mvpmodule.simple;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public class SimplePresenter {

    private SimpleView view;
    private SimpleModule module;
    public SimplePresenter(SimpleView view){
        this.view=view;
        this.module=new SimpleModule();
    }

    public void  getData(String params){
        view.showLoading();
        module.getNetData(params, new SimpleCallBack() {
            @Override
            public void onSuccess(String data) {
                view.showdata(data);
            }

            @Override
            public void onFailure(String msg) {
                view.showFailure(msg);

            }

            @Override
            public void onError() {
                view.showError();
            }

            @Override
            public void onComplete() {
                view.hideLoading();
            }
        });
    }
}
