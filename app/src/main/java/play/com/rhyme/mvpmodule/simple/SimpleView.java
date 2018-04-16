package play.com.rhyme.mvpmodule.simple;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public interface SimpleView {
    void showLoading();

    void hideLoading();

    void showdata(String data);

    void showFailure(String msg);

    void showError();


}
