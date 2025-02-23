package com.example.donetoday;

import android.app.Activity;
import android.os.Bundle;
import android.text.style.ScaleXSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.donetoday.databinding.CalendarFragmentBinding;

public class CalendarFragment extends Fragment {

    private CalendarFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = CalendarFragmentBinding.inflate(inflater, container, false);
        View calendarView = inflater.inflate(R.layout.calendar_fragment,container,false);

        TableLayout calendar = (TableLayout) calendarView.findViewById(R.id.calendar);

        TableRow row = new TableRow(calendarView.getContext());
        for (int i=0; i<7 ; i++){
            TextView tv = new TextView(calendarView.getContext());
            tv.setText(String.valueOf(i+1));
            row.addView(tv);
            System.out.println(String.valueOf(i));
        }

        calendar.addView(row);


        return calendarView;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

//        binding.buttonFirst.setOnClickListener(v ->
//                NavHostFragment.findNavController(CalendarFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment)
//        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}