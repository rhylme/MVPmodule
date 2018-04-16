package play.com.rhyme.mvpmodule.simple;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public interface SimpleCallBack {

    void onSuccess(String data);

    void onFailure(String msg);

    void onError();

    void onComplete();

}
