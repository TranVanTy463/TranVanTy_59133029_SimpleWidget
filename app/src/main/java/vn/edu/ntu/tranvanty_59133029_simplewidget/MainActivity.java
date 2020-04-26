package vn.edu.ntu.tranvanty_59133029_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

      EditText editTen, edtNgaySinh,edtSoThich;
      RadioGroup rdgGioiTinh;
      RadioButton rdbNam,rdbNu;
      CheckBox cbXemphim, cbNgheNhac, cbCF,cbONha,cbVaoBep;
     Button btnXacNhan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       addView();
       addEvent();

    }
    private  void addView()
    {
          editTen=findViewById(R.id.edtTen);
          edtNgaySinh= findViewById(R.id.edtNgaySinh);
          edtSoThich = findViewById(R.id.edtSoThich);
          rdgGioiTinh=findViewById(R.id.rdgGioiTinh);
          rdbNam = findViewById(R.id.rdbNam);
        rdbNu = findViewById(R.id.rdbNu);
          cbXemphim = findViewById(R.id.cbXemphim);
          cbNgheNhac = findViewById(R.id.cbNgheNhac);
          cbCF = findViewById(R.id.cbCF);
          cbVaoBep = findViewById(R.id.cVaoBep);
          cbONha = findViewById(R.id.cbONha);
          btnXacNhan= findViewById(R.id.btnXacNhan);

    }
    private  void addEvent()
    {
                btnXacNhan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       HienThi();
                    }
                });
    }
    private  void HienThi()
    {
            String TT1 =editTen.getText().toString()+"\n"+"Ngày sinh: "+edtNgaySinh.getText().toString()+"\n" ;
            String TT2 = "Giới tính: ";
        switch (rdgGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rdbNam:
                TT1 +=TT2 + rdbNam.getText().toString(); break;
            case R.id.rdbNu:
                TT1 +=TT2 + rdbNu.getText().toString(); break;
        }
        String TT3 = "\nSở thích: ";
        TT1 +=TT3;
       if (cbXemphim.isChecked())
       {
           TT1 +=cbXemphim.getText().toString()+";";
       }

        if (cbNgheNhac.isChecked())
        {
            TT1 +=cbNgheNhac.getText().toString()+";";
        }



        if (cbCF.isChecked())
        {
            TT1 +=cbCF.getText().toString()+";";
        }

        if (cbONha.isChecked())
        {
            TT1 +=cbONha.getText().toString()+";";
        }
        if (cbVaoBep.isChecked())
        {
            TT1 +=cbVaoBep.getText().toString()+";";
        }
          TT1 +=edtSoThich.getText().toString();
        Toast.makeText(getApplicationContext(),TT1,Toast.LENGTH_LONG).show();

    }

}
