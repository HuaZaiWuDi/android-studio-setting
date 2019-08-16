package ${PACKAGE_NAME};

import android.content.Context;

/**
 * Created by qindachang on ${DATE}.
 */

public class ${NAME}Presenter implements ${NAME}Contract.Presenter {
    private Context mContext;
    private ${NAME}Contract.View mView;

    public ${NAME}Presenter(Context context, ${NAME}Contract.View view) {
        mContext = context;
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void destroy() {
        mContext = null;
    }
}