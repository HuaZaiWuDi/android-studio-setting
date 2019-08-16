package ${PACKAGE_NAME};

import android.app.Application;

#parse("File Header.java")
public class ${NAME} extends Application {

    private static ${NAME} gInstance;

    public static ${NAME} getGInstance(){
        return  gInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        gInstance=this
    }
    
     @Override
    protected void attachBaseContext(final Context base) {
        super.attachBaseContext(base);
        adaptationOppo();
    }
    
    
    /**
     * 部分OPPO机型 AssetManager.finalize() timed out的修复
     */
    private void adaptationOppo() {
        try {
            Class clazz = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
            Method method = clazz.getSuperclass().getDeclaredMethod("stop");
            method.setAccessible(true);
            Field field = clazz.getDeclaredField("INSTANCE");
            field.setAccessible(true);
            method.invoke(field.get(null));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    
}
