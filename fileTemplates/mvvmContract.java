package ${PACKAGE_NAME};

/**
 * Created by qindachang on ${DATE}.
 */

public interface ${NAME}Contract {
    interface ICommand extends BaseICommand {
        ${NAME}Model getModel();
    }

    interface INotifyPropertyChanged {
        
    }

}