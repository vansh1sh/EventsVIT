package app.com.example.vansh.eventsvit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vansh on 29-Feb-16.
 */
public class OneFragment extends Fragment {

    public OneFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Intent intent = new Intent(getActivity(), Json1.class);
        startActivity(intent);
    return inflater.inflate(R.layout.fragment_one,container,false);
            }
}
