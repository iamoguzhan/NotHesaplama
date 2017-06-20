package nothesaplama.com.nothesaplama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;




public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9,
    spinner10, spinner11, spinner12, spinner13, spinner14, spinner15, spinner16, spinner17, spinner18,
    spinner19, spinner20, spinner21, spinner22, spinner23, spinner24, spinner25, spinner26, spinner27,
    spinner28, spinner29, spinner30, spinner31, spinner32, spinner33, spinner34, spinner35, spinner36,
    spinner37, spinner38, spinner39, spinner40;

    String sonuc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button hesapla = (Button) findViewById(R.id.button6);
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);         //Main3Activity e geçme
                i.putExtra("Sonuç",sonuc);
                startActivity(i);
            }
        });


        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        spinner8 = (Spinner) findViewById(R.id.spinner8);
        spinner9 = (Spinner) findViewById(R.id.spinner9);
        spinner10= (Spinner) findViewById(R.id.spinner10);
        spinner11= (Spinner) findViewById(R.id.spinner11);
        spinner12= (Spinner) findViewById(R.id.spinner12);
        spinner13= (Spinner) findViewById(R.id.spinner13);
        spinner14= (Spinner) findViewById(R.id.spinner14);
        spinner15= (Spinner) findViewById(R.id.spinner15);
        spinner16= (Spinner) findViewById(R.id.spinner16);
        spinner17= (Spinner) findViewById(R.id.spinner17);
        spinner18= (Spinner) findViewById(R.id.spinner18);
        spinner19= (Spinner) findViewById(R.id.spinner19);
        spinner20= (Spinner) findViewById(R.id.spinner20);
        spinner21= (Spinner) findViewById(R.id.spinner21);
        spinner22= (Spinner) findViewById(R.id.spinner22);
        spinner23= (Spinner) findViewById(R.id.spinner23);
        spinner24= (Spinner) findViewById(R.id.spinner24);
        spinner25= (Spinner) findViewById(R.id.spinner25);
        spinner26= (Spinner) findViewById(R.id.spinner26);
        spinner27= (Spinner) findViewById(R.id.spinner27);
        spinner28= (Spinner) findViewById(R.id.spinner28);
        spinner29= (Spinner) findViewById(R.id.spinner29);
        spinner30= (Spinner) findViewById(R.id.spinner30);
        spinner31= (Spinner) findViewById(R.id.spinner31);
        spinner32= (Spinner) findViewById(R.id.spinner32);
        spinner33= (Spinner) findViewById(R.id.spinner33);
        spinner34= (Spinner) findViewById(R.id.spinner34);
        spinner35= (Spinner) findViewById(R.id.spinner35);
        spinner36= (Spinner) findViewById(R.id.spinner36);
        spinner37= (Spinner) findViewById(R.id.spinner37);
        spinner38= (Spinner) findViewById(R.id.spinner38);
        spinner39= (Spinner) findViewById(R.id.spinner39);
        spinner40= (Spinner) findViewById(R.id.spinner40);

        Spinner allSpinners[] = {spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9,
                spinner10, spinner11, spinner12, spinner13, spinner14, spinner15, spinner16, spinner17, spinner18,
                spinner19, spinner20, spinner21, spinner22, spinner23, spinner24, spinner25, spinner26, spinner27,
                spinner28, spinner29, spinner30, spinner31, spinner32, spinner33, spinner34, spinner35, spinner36,
                spinner37, spinner38, spinner39, spinner40};



        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.krediler, android.R.layout.simple_spinner_item); //Adapterümüze itemlerimizi (krediler) attık
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //Aşağıya açılır spinnerın içinde itemlerimizin (krediler) gözükmesini sağladık

        for (int i = 0; i < 20; i++) {
            allSpinners[i].setAdapter(adapter);                 //Spinnerlarımızın içine ArrayAdapterdeki elemanlarımızı attık
        }



        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.harfler, android.R.layout.simple_spinner_item); // //Adapter ümüze itemlerimizi (harfler) attık
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //Aşağıya açılır spinnerın içinde itemlerimizin (harfler) gözükmesini sağladık

        for (int i = 20; i < 40 ; i++) {
            allSpinners[i].setAdapter(adapter2);                     //Spinnerlarımızın içine ArrayAdapterdeki elemanlarımızı attık

        }




        for (int i = 0; i < 40 ; i++) {
            allSpinners[i].setOnItemSelectedListener(this);               //spinner objelerine SelectenListener ı tanımladım
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {




        Spinner krediSpinner[] = {spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10,                       //Her bir kredi spinner objesini array e atılır
                                spinner11, spinner12, spinner13, spinner14, spinner15, spinner16, spinner17, spinner18, spinner19, spinner20};
        Spinner harfSpinner[] = {spinner21, spinner22, spinner23, spinner24, spinner25, spinner26, spinner27, spinner28, spinner29,                          //Her bir harf spinner objesi array e atılır
                                spinner30, spinner31, spinner32, spinner33, spinner34, spinner35, spinner36, spinner37, spinner38, spinner39, spinner40};


        double totalCarpim = 0.0;
        double totalKredi = 0.0;
        double ortalama;


        for (int i = 0; i < 20 ; i++) {


            Spinner a = krediSpinner[i];                                          //Her döngüde bir kredi objesi gelir ve bir "a" değişkenine atanır
            String selectedSpinner = (String) a.getSelectedItem();               //"a" değişkenine atanan spinner String tipine dönüştürülür ve "selectedSpinner" değişkenine atanır
            Double d = Double.parseDouble(selectedSpinner);                      //"selectedSpinner değişkeni double tipine dönüştürülür

            Spinner b = harfSpinner[i];                                          //Her döngüde bir harf objesi gelir ve bir "a" değişkenine atanır

            int selectedSpinnerPosition = b.getSelectedItemPosition();           //"b" spinner objesinden seçilen itemin pozisyonu "selectedSpinnerPosition" değişkenine atanır

            if (selectedSpinnerPosition == 0){


            }
            else if (selectedSpinnerPosition == 1){
                totalCarpim += d * 4.0;                                             //"b" spinner objesinden seçilen itemin pozisyonuna göre if-else sokularak gerekli işlemler yapılır
                                                                                    //Her döngü de seçilen kredi ile harf çarpıldığında çıkan sonuç totalCarpım adlı değişkene eklenir
            }
            else if (selectedSpinnerPosition == 2){
                totalCarpim += d * 3.5;

            }
            else if (selectedSpinnerPosition == 3){
                totalCarpim += d * 3.0;

            }
            else if (selectedSpinnerPosition == 4){
                totalCarpim += d * 2.5;

            }
            else if (selectedSpinnerPosition == 5){
                totalCarpim += d * 2.0;

            }
            else if (selectedSpinnerPosition == 6){
                totalCarpim += d * 1.5;

            }
            else if (selectedSpinnerPosition == 7){
                totalCarpim += d * 1.0;

            }
            else if (selectedSpinnerPosition == 8){
                totalCarpim += d * 0.5;

            }
            else if (selectedSpinnerPosition == 9){
                totalCarpim += d * 0.0;

            }

            totalKredi += d;                                                    //Her döngü de seçilen kredi totalKredi adlı değişkene eklenir

        }

        if (totalCarpim == 0.0 && totalKredi == 0.0){                           //Kullanıcı hiçbir şey seçmeyip hesapla butonuna basarsa ortalamanın NaN gözükmesini engeller
            totalKredi = 1.0;
        }

        ortalama = totalCarpim / totalKredi;



        String temp = Double.toString(ortalama);                                //Ortalama Stringe çevrilir


        if (temp.length() > 3){                                                 //Ortalamanın 3 haneli gözükmesi saplanır (2.85 gibi)
            sonuc = temp.substring(0,4);
        }
        else
            sonuc = temp;


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
