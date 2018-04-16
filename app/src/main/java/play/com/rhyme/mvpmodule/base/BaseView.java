package play.com.rhyme.mvpmodule.base;

public interface BaseView<T> {
    void showLoading();

    void hideLoading();

    void showdata(T data);

    void showFailure(String msg);

    void showError();


}
