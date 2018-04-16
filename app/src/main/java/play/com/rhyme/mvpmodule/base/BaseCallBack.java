package play.com.rhyme.mvpmodule.base;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public interface BaseCallBack<T> {

    void onSuccess(T data);

    void onFailure(String msg);

    void onError();

    void onComplete();

}
