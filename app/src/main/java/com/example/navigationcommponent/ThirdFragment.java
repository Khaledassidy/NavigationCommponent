package com.example.navigationcommponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThirdFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThirdFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "sfinput";

    // TODO: Rename and change types of parameters
    private SecondfragmentInput mParam1;

    public ThirdFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment ThirdFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThirdFragment newInstance(SecondfragmentInput param1) {
        ThirdFragment fragment = new ThirdFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 =(SecondfragmentInput) getArguments().getSerializable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView=view.findViewById(R.id.text_thirdfragment);
        textView.setText(mParam1.getSecondfragmenttext());

        Bundle bundle=new Bundle();
        bundle.putString("thirdfragmentstring","data from third fragemnt");
        //class l getparentfragemntmanager btejblak l fragemnt manager ta3el l conatiner ma7al ma bta3mel host la hay l fragemnt le heye l navhostfragemnt ya3ne braj3lk l fragemnt manager taba3 navhostfragemnt le howe contain hayde l fragemnt  le howe heda l fragemntmmanager responisble la ya3mel transaction w yzabet l backstack tba3 l fragemnt w kel she mnshofo edemna b2albo fe method esa setfragemntresult() bt5od key w value howee bundle

        getParentFragmentManager().setFragmentResult("Requestkey",bundle);
    }

}