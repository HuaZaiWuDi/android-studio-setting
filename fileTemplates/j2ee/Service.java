package ${PACKAGE_NAME};

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

#parse("File Header.java")
public class ${NAME} extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        
    }

     @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    
    @Override
    public void onDestroy() {
       
        super.onDestroy();
    }



    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
