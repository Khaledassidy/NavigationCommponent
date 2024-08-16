package com.example.navigationcommponent;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.AbstractList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link secondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class secondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "sfinput";
    private onclick2 onclick2;
    // TODO: Rename and change types of parameters
    private SecondfragmentInput mParam1;
    private NavBackStackEntry backStackEntry;
    private SavedStateHandle savedStateHandle;

    public secondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof onclick2){
            onclick2=(secondFragment.onclick2) context;
        }else{
            throw new RuntimeException();
        }
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment Fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static secondFragment newInstance(SecondfragmentInput param1) {
        secondFragment fragment = new secondFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = (SecondfragmentInput) getArguments().getSerializable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView=view.findViewById(R.id.txt_secondfrag);
        Button button=view.findViewById(R.id.btn_thridfrag);

        Navigation.findNavController(view).getPreviousBackStackEntry().getSavedStateHandle().set("stringkey","data from second fragemnt");



        textView.setText(mParam1.getSecondfragmenttext());
        button.setOnClickListener(v->{
            onclick2.clickitem();
        });

        getParentFragmentManager().setFragmentResultListener("Requestkey",getViewLifecycleOwner(),(requestKey, result) -> {
            textView.setText(result.getString("thirdfragmentstring"));

        });




    }

    public interface onclick2{
        void clickitem();
    }
}