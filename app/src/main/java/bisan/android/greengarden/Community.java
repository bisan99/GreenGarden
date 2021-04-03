package bisan.android.greengarden;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import bisan.android.greengarden.AskCommunity;
import bisan.android.greengarden.R;

public class Community extends Fragment {
    FloatingActionButton fab;
    Activity context;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_community, container, false);
    }
    public void onStart(){
        super.onStart();

        fab=context.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //create an Intent object
                Intent intent = new Intent(context, AskCommunity.class);
                startActivity(intent);
            }

        });
    }

}