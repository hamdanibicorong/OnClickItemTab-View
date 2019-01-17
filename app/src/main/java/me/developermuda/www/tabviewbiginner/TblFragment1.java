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

public class TblFragment1 extends Fragment {
    private static final String Tag = "Tab Layout";
    private Button btn_1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.tbl1_fragment,container,false);
        btn_1 = (Button)view.findViewById(R.id.btn1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"test button click1",Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
