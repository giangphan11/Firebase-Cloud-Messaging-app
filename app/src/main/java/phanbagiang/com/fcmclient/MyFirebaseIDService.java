package phanbagiang.com.fcmclient;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;

public class MyFirebaseIDService {
    /*
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token= FirebaseInstanceId.getInstance().getToken();
        luuTokenVaoCSDLRieng(token);
    }

     */

    private void luuTokenVaoCSDLRieng(String token) {
        new FireBaseIDTask().execute(token);
    }
}
