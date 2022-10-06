## Created_by_21343019_Arafil Azmi

Pada JS 7 ini kita diperkenalkan dengan Looping atau perulangan pada program java yang dimana terdapat beberapa pernyataan yang bisa digunakan untuk perulangan diantaranya sebagai berikut :

 1. Pernyataan FOR
      Bentuk pernyataan perulangan FOR adalah sebagai berikut :
      1. Tunggal :
          for (ungkapan 1; ungkapan 2; ungkapan 3)
          pernyataan ;
      2. Jamak :
           for (ungkapan 1; ungkapan 2; ungkapan 3)
           {
            pernyataan ;
            Pernyataan ;
           }
       
       Kegunaan dari masing - masing pernyataan for :
        1. Ungkapan 1 : digunakan untuk memberikan inisialisasi terhadap variabel pengendali loop.
        2. Ungkapan 2 : dipakai sebagai kondisi untuk keluar dari loop.
        3. Ungkapan 3 : dipakai sebagai pengatur kenaikan nilai variabel pengendali loop.
 
 2. Pernyataan WHILE
      Pada pernyataan WHILE pengecekan terhadap loop atau perulangan dilakukan dibagian awal ( sebelum bagian loop )
      atau bentuknya sebagai berikut :
         while(kondisi)
          pernyataan;
      yang mana pernyataan dapat berupa pernyataan tunggal, jamak maupun kosong.
      
 3. Pernyataan DO - WHILE
      Pada pernyataan DO - WHILE pengecekan terhadap DO dilakukan terlebih dahulu baru ke pengecekan kondisi pada WHILE yang dimana pernyataan dapat berupa pernyataan
      tunggal, jamak ataupun kosong.
      Bentuk pernyataan DO - WHILE sebagai berikut :
        do
          pernyataan;
        while(kondisi).
        
Untuk program latihan berikut penjelasannya :
 
   1. Program Latihan 1, 2 dan 3
        Pada program latihan 1,2 dan 3 kita menggunakan pernyataan for yang dimana masing - masing program memiliki 3 ungkapan yang berbeda pada masing - masing
        program.
        
        Pada program latihan 1 terdapat variabel bilangan bertipe integer. Pernyataan for memiliki ungkapan dimana :
        bilangan = 20 ; bilangan <= 100 ; bilangan += 10
        yang artinya variabel bilangan memiliki nilai atau isi = 20 dan akan melakukan perulangan dari angka 20 sampai dengan 100 dengan kenaikan isi variabel bilangan
        sebesar 10 sampai dengan yang telah ditentukan.
        
        Pada program latihan 2 terdapat variabel bilangan bertipe integer. Pernyataan for memiliki ungkapan dimana :
        bilangan = 60 ; bilangan >= 10 ; bilangan -=10
        yang artinya variabel bilangan memiliki nilai atau isi = 60 dan akan melakukan perulangan dari angka 60 sampai dengan 10 dengan penurunan isi variabel bilangan
        sebesar 10 sampai dengan yang telah ditentukan.
        
        Pada program latihan 3 terdapat variabel bil bertipe integer. Pernyataan for memiliki ungkapan dimana :
        bil = 0 ; bil <=10 ; bil ++
        yang artinya variabel bil memiliki nilai atau isi = 0 dan akan melakukan perulangan dari angka 0 sampai dengan 10 dengan kenaikan isi variabel bilangan naik
        satu tingkat yang tadinya 0 menjadi 1 lalu 1 menjadi 2 sampai dengan yang telah ditentukan.
        
   2. Program Latihan 4 dan 5
        Pada program latihan 4 dan 5 kita menggunakan pernyataan WHILE yang dimana masing - masing program memiliki kondisi untuk perulangan.
        
        Pada program latihan 4 terdapat variabel i bertipe integer dengan inisialisasi atau isi variabel i = 0.
        Pada pernyataan while memiliki kondisi ( i <= 10 ) dan pernyataannya adalah i++.
        Yang artinya program akan mengecek isi dari variabel i apakah sesuai dengan kondisi pada pernyataan WHILE, jika kondisi benar maka akan terjadi kenaikan
        isi dari variabel i ditambah 1 sesuai dengan batas kondisi yang telah dibuat.
        
        Pada program latihan 5 terdapat variabel i bertipe integer degan inisialisasi variabel atau isi variabel i = 20
        Pada pernyataan while memiliki kondisi ( i < 10 ) dan pernyataan i akan ditambah 1 jika kondisi benar.
        Pada program ini terdapat kesalahan dimana kondisi tidak sesuai atau salah maka pernyataan tidak akan dijalankan solusinya adalah kita bisa mengganti
        pernyataan dengan (i > 10) karena memang nilai dari i = 20 dan pernyataan i dikurang 1 maka perulangan akan dijalankan karena kondisi benar atau pun bisa
        hanya mengganti isi dari variabel i menjadi nilai yang kurang dari 10 maka kondisi pertama benar dan program akan dijalankan.
        
   3. Program Latihan 6,7 dan 8
        Pada program latihan 6,7 dan 8 kita menggunakan pernyataan DO - WHILE yang dimana pernyataan DO akan dilakukan bila kondisi while benar.
        
        Pada program latihan 6 terdapat variabel i bertipe integer dengan inisialisasi atau isi variabel = 0 dan pernyataan do berisikan nilai dari variabel
        i akan ditambah 1 ketika kondisi (i < 10). Dikarenakan kondisi benar (0 < 10) maka pernyataan pada do akan dijalankan yaitu i ditambah 1 sesuai batas
        kondisi yang telah ditentukan.
        
        Pada program latihan 7 terdapat variabel i bertipe integer dengan inisialisasi atau isi variabel = 0 dan pernyataan do berisikan nilai dari variabel
        i akan ditambah sama dengan 10 ketika kondisi (i <= 100). Dikarenakan kondisi benar (0 <= 100) maka pernyataan pada do akan dijalankan yaitu i ditambah 10
        sesuai batas kondisi yang telah ditentukan.
        
        Pada program latihan 8 terdapat variabel i bertipe integer dengan inisialisasi atau isi variabel = 20 dan pernyataan do berisikan nilai dari variabel
        i akan ditambah 1 ketika kondisi (i < 10). Dikarenakan kondisi salah (20 < 10) maka pernyataan pada do tidak akan dijalankan.
        Maka kita bisa mengganti variabel i menjadi dibawah angka 10 atau bisa dengan merubah kondisi dengan ( i > 10 ) dan pernyataan pada do diubah menjadi i 
        akan dikurang 1 ketika kondisi ( i > 10 ) maka program akan dapat dijalankan.
        
   4. Program Latihan 9
        Pada program latihan 9 merupakan perulangan bersarang yang dimana terdapat peryataan for didalam pernyataan for.
        Pada program terdapat variabel baris, kolom, hasil_kali dan MAKS = 8 bertipe integer. Pada for pertama terdapat ungkapan baris = 1 ; baris <= MAKS ; baris ++
        dan pada for kedua yang terdapat didalam for pertama ungkapan kolom = 1 ; kolom <= MAKS ; kolom ++ dan pernyataannya adalah hasil_kali = baris * kolom.
        dan akan mencetak dari variabel hasil_kali.
        Yang artinya variabel baris nilainya atau isinya 1 dan program akan mengecek ke ungkapan kedua apakah benar baris <= MAKS jika benar maka baris akan 
        ditambahkan 1 jika benar maka ungkapan pada for kedua akan dicek kembali dengan kolom isi variabelnya 1 dan program akan mengecek ke ungkapan kedua
        apakah benar kolom <= MAKS jika benar maka kolom akan ditambahkan 1 dan pernyataan dalam for kedua dapat dijalankan oleh program.
        
Untuk program Tugas berikut penjelasannya :
        
    
   1. Program Tugas 1
        Pada program tugas 1 kita diminta mencetak inputan nama masing - masing sebanyak 10 kali dengan menggunakan pernyataan FOR, WHILE dan DO - WHILE.
        Karena pada program kita diminta menginput maka kita menggunakan class Scanner dengan cara mengimportnya terlebih dahulu pada masing - masing program
        baik itu pada pernyataan FOR, WHILE dan DO - WHILE. Setelah itu kita bisa membuat nama variabel baru untuk class Scanner sebagai media penyimpanan data
        yang diinputkan setelah itu kita bisa menggunakan pernyataan perulangan.
        
        Pada program FOR, WHILE dan DO - WHILE terdapat variabel jml.
        Untuk pernyataan for kita membuat ungkapan ( jml = 1 ; jml <= 10 ; jml++ ) dan pada pernyatan diminta untuk mencetak inputan dengan mengambil isi dari 
        variabel nama yang sudah dibuat, diinputkan serta disimpan.
        artinya jml bernilai 1, jml akan diulang dari 1 sampai dengan 10 sesuai ungkapan kedua maka jml akan ditambah 1, jika ungkapan benar maka pernyataan for
        akan dijalankan.
        Untuk pernyataan while dan do - while sama halnya dengan for terdapat pernyataan yang sama yang membedakan hanayalah ketika while kita membuat kondisi 
        lalu pernyataan dan ketika do - while kita membuat pernyataan do terlebih dahulu lalu kondisi while akan dicek oleh program jika benar maka pernyataan 
        akan dijalankan.
          
   2. Program Tugas 2
        Pada program tugas 2 kita diminta mencetak angka 20 sampai dengan angka 1 dengan menggunakan pernyataan FOR, WHILE dan DO - WHILE.
        Sama halnya pada program tugas 1 kita membuat variabel dan membuat ungkapan pada FOR , kondisi untuk WHILE dan untuk DO  - WHILE kita membuat pernyataan
        terlebih dahulu lalu mengecek kondisi pada while dengan pada program kita membuat -- pada variabel karena diminta penurunan angka dari 20 sampai 1.
        Jika ungkapan dan kondisi yang kita buat benar maka pernyataan pada program baik itu FOR, WHILE dan DO - WHILE akan dijalankan.
           
   3. Program Tugas 3
        Pada program tugas 3 kita diminta menggunakan perulangan bersarang ( nested loop ) dengan mencetak sesuai tampilan yang ditentukan.
        Disini saya menggunakan program bersarang for didalam for yang dimana diminta inputan maka kita bisa menggunakan class Scanner sebagai media penyimpanan
        inputan.
        
        Pada program terdapat variabel i, j dan jml_baris bertipe integer. Pada pernyataan for pertama ungkapannya adalah ( i = 1; i <= jml_baris ; i++ )
        untuk for kedua ungkapannya adalah ( j = 1 ; j <= i ; j++) dan pernyataanya adalah mencetak dari variabel i dan membuat garis baru setelah i dicetak.
        Yang artinya pada program akan mengecek ungkapan pada for pertama dimana i = 1 dan i <= jml_baris (sesuai dengan yang diinputkan) jika benar maka i akan
        ditambah 1, jika ungkapan benar maka program akan mengecek pada ungkapan for kedua yaitu j = 1 dan j <= i jika benar maka j akan ditambahkan 1 dan jika
        ungkapan pada for kedua benar maka program akan mencetak isi dari nilai i dan membuat baris baru setelah sesuai dengan ungkapan dan sesuai dengan jml_baris
        yang diinputkan.
        
        
        
        
        
        
        
        
