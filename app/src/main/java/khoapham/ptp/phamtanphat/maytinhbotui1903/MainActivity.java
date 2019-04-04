package khoapham.ptp.phamtanphat.maytinhbotui1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


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

       //Lay du lieu
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinh(0);
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tinh(1);
            }
        });
    }
    private void tinh(int index){
        int ketqua = 0;
        String sothu1 = edtSothu1.getText().toString();
        String sothu2 = edtSothu2.getText().toString();

        int sth1 = Integer.parseInt(sothu1);
        int sth2 = Integer.parseInt(sothu2);
        if (index == 0){
           ketqua = sth1 + sth2;
        }else if(index == 1){
            ketqua = sth1 - sth2;
        }
        txtKetqua.setText(" = " + ketqua );
    }

    // 1 :pham vi hoat dong access modifier :
    //  public private protected default
//   2 : gia tri tra ve sau khi thuc thi xong
//    void kieu du lieu dac biet khong can tra ve(khong dung return)
//        private int Cong2So(int a , int b){
//            int ketqua = a + b;
//            return ketqua;
//        }
}
