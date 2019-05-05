package com.morningstar.mfajarm_app.view.fragment;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.morningstar.mfajarm_app.R;

public class ProfileFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View myFragmentView = inflater.inflate(R.layout.profile_fragment, container, false);
        ImageView logo1 = (ImageView)myFragmentView.findViewById(R.id.facebook);
        ImageView logo2 = (ImageView)myFragmentView.findViewById(R.id.instagram);
        ImageView logo3 = (ImageView)myFragmentView.findViewById(R.id.whatsapp);
        Button btnMaps = (Button)myFragmentView.findViewById((R.id.btnmaps));
        Button dialogAbout = (Button)myFragmentView.findViewById(R.id.btaboutme);
        logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent("android.intent.action.VIEW",

                        Uri.parse("https://www.facebook.com/ajayfaul25/"));

                startActivity(browserIntent);
            }
        });
        logo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent("android.intent.action.VIEW",

                        Uri.parse("https://www.instagram.com/ajayfaul/"));

                startActivity(browserIntent);
            }
        });
        logo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formattedNumber = "087717596009";
                try{
                    Intent sendIntent =new Intent("android.intent.action.MAIN");
                    sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    sendIntent.putExtra(Intent.EXTRA_TEXT,"");
                    sendIntent.putExtra("jid", formattedNumber +"@s.whatsapp.net");
                    sendIntent.setPackage("com.whatsapp");
                    startActivity(sendIntent);
                }
                catch(Exception e)
                {
                    Toast.makeText(myFragmentView.getContext(),"Error/n"+ e.toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/search/?api=1&query=-6.8856043,107.6139917"));
                startActivity(intent);
            }
        });

        dialogAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setCancelable(true);

                View view  = getActivity().getLayoutInflater().inflate(R.layout.profile_fragment,null);
                dialog.setContentView(view);
                dialog.getWindow().setBackgroundDrawableResource(R.drawable.card1);
                dialog.setTitle("ABOUT");

                Button button = (Button)dialog.findViewById(R.id.ok);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });


        return myFragmentView;
    }

}
