package khoapham.ptp.phamtanphat.maytinhbotui1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //1 khai bao
    TextView txtTitle,txtKetqua;
    EditText edtSothu1 , edtSothu2;
    Button btnCong, btnTru, btnNhan,btnChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2 anh xa
       txtTitle = findViewById(R.id.textviewTitle);
       txtKetqua = findViewById(R.id.textviewKetqua);
       edtSothu1 = findViewById(R.id.edittextSothu1);
       edtSothu2 = findViewById(R.id.edittextSothu2);
       btnChia = findViewById(R.id.buttonChia);
       btnCong = findViewById(R.id.buttonCong);
       btnNhan = findViewById(R.id.buttonNhan);
       btnTru = findViewById(R.id.buttonTru);

       btnTru.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               
           }
       });
    }


}
