package justec.qin.demo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class RemoteService extends Service {
    private MyBinder myBinder;
    public RemoteService(){}

    @Override
    public void onCreate() {
        super.onCreate();
        if(myBinder==null){
            myBinder = new MyBinder();
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    class MyBinder extends IMyAidlInterface.Stub{

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String callRemote() throws RemoteException {
            return "成功调用远程服务！";
        }
    }
}
