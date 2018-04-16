package play.com.rhyme.mvpmodule.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者: rhyme(rhymelph@qq.com).
 * 日期: 2018/4/16.
 * 描述: [].
 */
public abstract class BaseFragment extends Fragment implements BaseView {
    protected View mView;
    protected Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mView==null){
            mView=inflater.inflate(getLayoutId(),container,false);
        }
        this.mContext=getContext();
        initAllMenbersView(savedInstanceState);
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(mView);

    }

    protected abstract void initView(View mView);

    protected abstract void initAllMenbersView(Bundle savedInstanceState);

    protected abstract int getLayoutId();

    @Override
    public void showLoading() {
        assert checkActivityAttached();
        assert mView != null;

    }

    @Override
    public void hideLoading() {
        assert checkActivityAttached();
        assert mView != null;

    }

    @Override
    public void showdata(Object data) {
        assert checkActivityAttached();
        assert mView != null;

    }

    @Override
    public void showFailure(String msg) {
        assert checkActivityAttached();
        assert mView != null;

    }

    @Override
    public void showError() {
        assert checkActivityAttached();
        assert mView != null;

    }

    public boolean checkActivityAttached(){
        return getActivity()!=null;
    }
}
