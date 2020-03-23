package com.example.cacheexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.androidyuan.libcache.FastHugeStorage;
import com.androidyuan.libcache.data.SerializableTicket;
import com.example.cacheexample.bean.SerlzEngineer;

/**
 * This class test that {@SerializableTicket} is used to cache {@SerializableTicket}.
 */
public class SerializableActivity extends Activity {

    private String uuid;
    private TextView textView;

    @Override
    public void onCreate(Bundle save) {
        super.onCreate(save);

        setContentView(R.layout.activity_test_parcelable_cache);
        textView = findViewById(R.id.text);

    }


    public void onClickPut(View view) {
        uuid = FastHugeStorage.getInstance().put(new SerializableTicket(new SerlzEngineer()));
        textView.setText("put Engineer result :\n " + uuid);
    }

    public void onClickPop(View view) {
        if (uuid != null) {
            SerlzEngineer engineer = (SerlzEngineer) FastHugeStorage.getInstance().popTicket(uuid).getBean();
            textView.setText("pop Engineer from cache : \n" + engineer);
            uuid = null;//You has to empty uuid.
        } else {
            textView.setText("pls click put.");
        }
    }
}
