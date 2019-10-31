package com.example.mobprog2.helper;

public class preferences {
    public class MainActivity extends AppCompatActivity {
        SharedPreferences pref;
        SharedPreferences.Editor editor;
        EditText txNama,txAlamat,txUmur;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            txNama=findViewById(R.id.edNama);
            txAlamat=findViewById(R.id.edAlamat);
            txUmur=findViewById(R.id.edUmur);
            pref = getApplicationContext().getSharedPreferences("NamaPref", 0); // 0 - untuk mode pribadi
            if(pref.getString("nama", null)!=null) { //jika pref nama tidak kosong
                txNama.setText(pref.getString("nama",null));
                txAlamat.setText(pref.getString("alamat",null));
                txUmur.setText(pref.getString("umur",null));
            }
        }
        public void klikSimpan(View v){
            editor=pref.edit();
            editor.putString("nama",txNama.getText().toString());
            editor.putString("alamat",txAlamat.getText().toString());
            editor.putString("umur",txUmur.getText().toString());
            editor.commit();
            Toast.makeText(this,"Data Sudah Tersimpan",Toast.LENGTH_SHORT).show();
        }
        public void klikPage2 (View v){
            Intent i=new Intent(this,Activity2.class);
            startActivity(i);
        }
        public void klikPage3 (View v){
            Intent i=new Intent(this,Activity3.class);
            startActivity(i);
        }
    }
}
