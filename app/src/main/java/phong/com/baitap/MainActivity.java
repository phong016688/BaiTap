package phong.com.baitap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String [] arr = new String[] { "AN GIANG",
                         "BÀ RỊA - VŨNG TÀU",
                         "BẮC GIANG",
                         "BẮC KẠN",
                         "BẠC LIÊU",
                         "BẮC NINH",
                         "BẾN TRE",
                         "BÌNH ĐỊNH",
                         "BÌNH DƯƠNG",
                         "BÌNH PHƯỚC",
                         "BÌNH THUẬN",
                         "CÀ MAU",
                         "CAO BẰNG",
                         "ĐẮK LẮK",
                         "ĐẮK NÔNG",
                         "ĐIỆN BIÊN",
                         "ĐỒNG NAI",
                         "ĐỒNG THÁP",
                         "GIA LAI",
                         "HÀ GIANG",
                         "HÀ NAM",
                         "HÀ TĨNH",
                         "HẢI DƯƠNG",
                         "HẬU GIANG",
                         "HÒA BÌNH",
                         "HƯNG YÊN",
                         "KHÁNH HÒA",
                         "KIÊN GIANG",
                         "KON TUM",
                         "LAI CHÂU",
                         "LÂM ĐỒNG",
                         "LẠNG SƠN",
                         "LÀO CAI",
                         "LONG AN",
                         "NAM ĐỊNH",
                         "NGHỆ AN",
                         "NINH BÌNH",
                         "NINH THUẬN",
                         "PHÚ THỌ",
                         "QUẢNG BÌNH",
                          "QUẢNG NAM",
                         "QUẢNG NGÃI",
                         "QUẢNG NINH",
                         "QUẢNG TRỊ",
                         "SÓC TRĂNG",
                         "SƠN LA",
                         "TÂY NINH",
                         "THÁI BÌNH",
                         "THÁI NGUYÊN",
                         "THANH HÓA",
                         "THỪA THIÊN HUẾ",
                         "TIỀN GIANG",
                         "TRÀ VINH",
                         "TUYÊN QUANG",
                         "VĨNH LONG",
                         "VĨNH PHÚC",
                         "YÊN BÁI",
                         "PHÚ YÊN",
                         "ĐÀ NẴNG",
                         "HẢI PHÒNG",
                         "HÀ NỘI",
                         "TP HCM",
                         "CẦN THƠ"};
        ListView lv = findViewById(R.id.listview2);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 intent.putExtra(Intent.EXTRA_COMPONENT_NAME, arr[position]);
                 startActivity(intent);

            }
        });

    }

}
