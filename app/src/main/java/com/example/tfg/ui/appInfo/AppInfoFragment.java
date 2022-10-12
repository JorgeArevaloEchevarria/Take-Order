package com.example.tfg.ui.appInfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tfg.databinding.FragmentAppinfoBinding;

public class AppInfoFragment extends Fragment{
    private @NonNull FragmentAppinfoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AppInfoViewModel appInfoViewModel =
                new ViewModelProvider(this).get(AppInfoViewModel.class);

        binding = FragmentAppinfoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAppInfo;
        appInfoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
