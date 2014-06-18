package com.app.citizen.services.activity;


import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.app.citizen.services.R;

/**
 * Created by ainurminibaev on 18.06.14.
 */
public class HospitalActivity extends Activity {
    int DIALOG_DATE = 1;
    int myYear = 2014;
    int myMonth = 07;
    int myDay = 20;
    TextView tvDate;

    TextView tvDate2;
    String[] data = {"поликлиника №7", "поликлиника №11", "гор больница №5"};

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital);
        tvDate = (TextView) findViewById(R.id.tvDate);
        tvDate2 = (TextView) findViewById(R.id.tvDate);

        // адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        // заголовок
        spinner.setPrompt("Выберите больницу");
        // выделяем элемент
        spinner.setSelection(2);
        // устанавливаем обработчик нажатия
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // показываем позиция нажатого элемента
                Toast.makeText(getBaseContext(), "Выбрано " + position, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }
    public void onclick(View view) {
        showDialog(DIALOG_DATE);
    }





    /** Called when the activity is first created. */


    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_DATE) {
            DatePickerDialog tpd = new DatePickerDialog(this, myCallBack, myYear, myMonth, myDay);
            return tpd;
        }
        return super.onCreateDialog(id);
    }

    DatePickerDialog.OnDateSetListener myCallBack = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            myYear = year;
            myMonth = monthOfYear;
            myDay = dayOfMonth;
            //todo КОСТЫЛЬ
            if (myDay == 20 || myDay == 22) {

                tvDate.setText("Запись на " + myDay + "/" + myMonth + "/" + myYear + " ЗАНЯТА ");

                tvDate2.setText("Попробуйте " + myDay+1 + "/" + myMonth + "/" + myYear);
            } else {
                tvDate2.setText("");
                tvDate.setText("Запись на " + myDay + "/" + myMonth + "/" + myYear + " свободна");

            }
        }
    };

}
