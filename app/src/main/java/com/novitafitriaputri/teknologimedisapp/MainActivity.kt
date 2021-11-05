package com.novitafitriaputri.teknologimedisapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Macam - Macam Teknologi Medis"
        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.plasterdb," Plaster Anti Diabetes","Mencegah ataupun mampu mengurangi Diabetes",
            "Diabetes merupakan salah satu penyakit berbahaya yang kalau tidak ditangani " +
                    "dengan benar dapat mengancam hidup si penderita. Sudah banyak orang yang terkena " +
                    "penyakit diabetes ini, maka dengan adanya teknologi plester anti-diabetes diharapkan " +
                    "dapat mencegah ataupun mampu mengurangi diabetes di dalam tubuh. " +
                    "Tentu alat ini akan sangat bermanfaat bagi manusia."))

        data?.add(DataModel(R.drawable.aspirinelektrik,"Aspirin Elektrik","Mengatasi Sakit Kepala",
            "Pastinya Anda pernah mengalami yang namanya sakit kepala seperti migraine. " +
                    "Biasanya orang kalau sudah sakit kepala atau migraine, akan langsung minum obat pereda sakit kepala. " +
                    "Tetapi, seiring berjalannya waktu dan dengan adanya perkembangan teknologi, " +
                    "hadirlah sebuah penemuan canggih yaitu aspirin elektrik. " +
                    "Dari namanya pun sudah jelas bahwa alat baru ini bertujuan untuk mengatasi sakit kepala " +
                    "sama seperti obat aspirin yang Anda minum ketika terserang sakit di kepala. Bagaimana alat ini dapat berfungsi untuk menghilangkan rasa sakit di kepala? " +
                    "Rupanya teknologi tersebut memakai pemancar listrik kecil yang dimanfaat untuk menghilangkan sakit kepala atau migraine"))

        data?.add(DataModel(R.drawable.robotcekup,"Robot Cek Up Kesehatan","Membantu Rumah Sakit Untuk Cek Up Pasien",
            "Penemuan robot checkup untuk kesehatan ini dibuat oleh perusahaan iRobot Corp dan In Touch health. " +
                    "Dua perusahaan tersebut merupakan perusahaan besar yang sanggup membuat terobosan teknologi di bidang medis. " +
                    "Dengan dibuatnya alat canggih berupa robot untuk checkup kesehatan ini, pastinya rumah sakit yang memakainya serta pasien yang ada akan sangat terbantu. " +
                    "Memang tujuan dibuatnya robot medis ini adalah untuk membantu rumah sakit apalagi ketika sedang ramai dan penuh dengan pasien."))

        data?.add(DataModel(R.drawable.scannerkangkerkulit,"Scanner Kangker Kulit","Mendeteksi Adanya Kangker Kulit",
            "Kanker juga adalah penyakit membahayakan yang mampu mengancam nyawa seseorang. Dari semua jenis kanker yang ada, " +
                    "kanker kulit juga sangat berbahaya bagi kesehatan sehingga penanganannya haruslah tepat. " +
                    "Ada terobosan teknologi terbaru di bidang medis untuk kanker kulit ini, yaitu scanner kanker kulit dengan gelombang elektromagnetik. " +
                    "Penemuan terbaru ini dibuat pertama kali oleh Mela Find. Fungsi dari alat ini ialah untuk mengetahui jenis kanker pada kulit, " +
                    "intinya sebagai sebuah detektor. Dengan begitu, pasien dapat mengetahui apakah penyakit kulit yang diidapnya berbahaya atau tidak. " +
                    "Alat ini memakai teknologi fotografi dengan jenis gelombang elektromagnetik sangat panjang untuk melakukan scanner. Setelah itu, " +
                    "data yang berhasil diambil akan dicocokkan menggunakan database melanoma yang sudah dikumpulkan dan sudah ada sebelumnya." +
                    "\n"))

        data?.add(DataModel(R.drawable.mri,"MRI (Magnetic Resonance Imaging)","Diagnosa bagian struktur tubuh manusia dengan gelombang electromagnetic",
            "digunakan untuk mendiagnosa bagian struktur tubuh manusia dengan gelombang electromagnetic, " +
                    "yang tidak memberi efek radiasi seperti sinar X. Alat ini sangat berguna untuk pemeriksaan saraf, " +
                    "jaringan otot, jantung dan pembuluh darah dan tumor. Semakin besar teslanya atau kekuatan magnetiknya semakin baik kualitas gambarnya"))

        data?.add(DataModel(R.drawable.elektrodiagram,"Elektrokardiogram (EKG)","Rekaman aktivitas elektrik jantung",
            "Elektrokardiogram adalah rekaman aktivitas elektrik jantung sebagai grafik jejak garis pada kertas grafik. " +
                    "Bentuk jejak garis yang naik dan turun tersebut dinamakan gelombang (wave). " +
                    "Proses perekaman aktivitas listrik jantung dalam bentuk grafik disebut elektrokardiografi."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("manfaat", item?.manfaat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}