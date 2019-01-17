package me.developermuda.www.tabviewbiginner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

public class TabFragment2 extends Fragment {
    private static final String Tag = "Tab Layout";
    private Button btn_2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.tbl2_fragment,container,false);
        btn_2 = (Button)view.findViewById(R.id.btn2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"test button click2",Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
