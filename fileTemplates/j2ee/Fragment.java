package ${PACKAGE_NAME};

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

#parse("File Header.java")
public class ${NAME} extends Fragment {
    
    public static ${NAME} newInstance($args$) {
    $nullChecks$
    android.os.Bundle args = new Bundle();
    $addArgs$
    Fragment fragment = new ${NAME}();
    fragment.setArguments(args);
    return fragment;
    }
    
    
    
    
}