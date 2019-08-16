package ${PACKAGE_NAME};

import android.app.Activity;
import android.os.Bundle;

#parse("File Header.java")
public class ${NAME} extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    
    @Override
    public void onDestroyed(Activity activity) {
        super.onDestroyed();
    }

    
}