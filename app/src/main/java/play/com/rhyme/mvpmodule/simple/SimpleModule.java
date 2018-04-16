package play.com.rhyme.mvpmodule.simple;

import android.os.Handler;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public class SimpleModule {

    public  void getNetData(final String params, final SimpleCallBack callBack){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (params){
                    case "normal":
                        callBack.onSuccess("success");
                        break;
                    case "failture":
                        callBack.onFailure("failture");
                        break;
                    case "error":
                        callBack.onError();
                        break;
                }
                callBack.onComplete();
            }
        },2000);
    }
}
