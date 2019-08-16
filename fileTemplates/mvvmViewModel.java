package ${PACKAGE_NAME};

import android.content.Context;

/**
 * Created by qindachang on ${DATE}.
 */

public class ${NAME}ViewModel implements ${NAME}Contract.ICommand {

    private Context mContext;
    private ${NAME}Contract.INotifyPropertyChanged mINotifyPropertyChanged;
    private ${NAME}Model mModel;

    public ${NAME}ViewModel(Context context, ${NAME}Contract.INotifyPropertyChanged INotifyPropertyChanged) {
        mContext = context;
        mINotifyPropertyChanged = INotifyPropertyChanged;
        mModel = new ${NAME}Model();
    }

    @Override
    public void start() {

    }

    @Override
    public void destroy() {
        mContext = null;
    }

    @Override
    public ${NAME}Model getModel() {
        return mModel;
    }
}
