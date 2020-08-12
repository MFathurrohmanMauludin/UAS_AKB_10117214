package com.fathurrohman.uas_akb_10117214.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fathurrohman.uas_akb_10117214.R;
import com.fathurrohman.uas_akb_10117214.model.Wisata;
import com.fathurrohman.uas_akb_10117214.presenter.AdapterLocation;

import java.util.ArrayList;

/*
 * 12 Agustus 2020 - 10117214 - M Fathurrohman Mauludin - IF7
 */

public class HomeFragment extends Fragment {

    private RecyclerView recyclerViewWisata;
    private ArrayList<Wisata> listwisata;

    private Activity activity;
    private MainView mainView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewWisata = view.findViewById(R.id.recyclerView);
        listwisata = new ArrayList<>();

        listwisata();
        tampilwisata();
        return view;
    }

    private void listwisata(){

        listwisata.add(new Wisata(
                "Danau Situ Patenggang Ciwidey",
                "Danau Situ Patenggang terletak sekitar 7 Km dari Kawah Putih. Pemandangan yang disuguhkan danau ini sangat indah. Dikelilingi oleh lembah dan perkebunan teh yang hijau, banyak pengunjung menjadikan tempat ini sebagai tempat bersantai bersama keluarga dan teman.\n" +
                        "\n" +
                        "Anda bisa menggunakan perahu untuk mengarungi danau tersebut atau mengunjungi situs legenda Batu Cinta yang terletak di pulau kecil di tengah danau.Udara sekitar danau tergolong sejuk dan cenderung dingin, memberikan suasana segar bagi tubuh dan pikiran yang penat. Tempat wisata di Bandung Selatan ini direkomendasikan untuk dikunjungi.",
                "Jl. Situ Patenggang, Patengan, Kec. Rancabali, Bandung, Jawa Barat",
                -7.1638224, 107.355102,
                R.drawable.situ_patenggang));

        listwisata.add(new Wisata(
                "Floating Market Lembang",
                "Floating Market Lembang wajib untuk anda kunjungi jika berlibur ke Bandung. Berada di daerah Lembang, suasananya adem banget.\n" +
                        "\n" +
                        "Di Floating market anda bisa menemukan berbagai wahana permainan, kuliner, dan spot indah untuk berfoto. Tempat ini sudah populer sebelum dusun bambu ataupun floating market beroperasi.",
                "Jl. Grand Hotel No.33E, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.8155636,
                107.6146515,
                R.drawable.floating_market));

        listwisata.add(new Wisata(
                "Gunung Tangkuban Parahu",
                "Gunung Tangkuban Perahu merupakan salah satu situs wisata terkenal di Indonesia. Terletak di daerah Lembang, sekitar 20 kilometer di utara Kota Bandung, gunung yang bentuknya menyerupai perahu terbalik ini selalu padat pengunjung pada akhir pekan dan waktu liburan.\n" +
                        "\n" +
                        "Tangkuban perahu memiliki 2 kawah yang cukup terkenal, kawah paling besar dinamakan Kawah Ratu, berada di bagian atas situs wisata ini. Kawah kedua yang berada sekitar 1,2 Km dibawahnya dinamakan Kawah Domas, di kawah ini Anda dapat merebus telur hingga matang di air belerang yang mendidih di salah satu mata airnya.",
                "Jl. Raya Tangkuban Parahu, Cicadas, Sagalaherang, Kabupaten Subang, Jawa Barat",
                -6.7596683,
                107.6139588,
                R.drawable.gunung_tangkuban_parahu));

        listwisata.add(new Wisata(
                "Puncak Bintang Lembang",
                "Puncak Bintang Bandung berada tidak jauh dari pusat kota. Di tempat ini, anda bisa menikmati suasana alam yang masih segar dan pemandangan kota dari wilayah atas. Bisa dikatakan, tempat ini merupakan tempat paling ideal buat melihat kota Bandung dari ketinggian.",
                "Cimenyan, Kec. Cimenyan, Bandung, Jawa Barat",
                -6.8415182,
                107.675108,
                R.drawable.puncak_bintang));

        listwisata.add(new Wisata(
                "Curug Cinulang",
                "Curug Cinulang terletak di perbatasan kabupaten Bandung dengan Sumedang. Tapi tempatnya lebih mudah dijangkau dari Bandung, tepatnya dari Cicalengka.\n" +
                        "\n" +
                        "Lokasinya berada di pinggir jalan dan lumayan asyik buat liburan. Bagi anda yang kebetulan ada di area Bandung timur, bisa menyempatkan diri berwisata ke curug cinulang ini.",
                "Cicalengka Sindang Wangi, Sindulang, Cimanggung, Sindulang, Kec. Cimanggung, Kabupaten Sumedang, Jawa Barat",
                -6.9630187,
                107.8801417,
                R.drawable.curug_cinulang));

        listwisata.add(new Wisata(
                "Curug Tilu Leuwi Opat Lembang",
                "Mau trekking ringan di Lembang? anda bisa berkunjung ke curug tilu leuwi opat. tempatnya berada di area Parongpong lembang, tidak jauh dari dusun bambu dan curug cimahi.\n" +
                        "\n" +
                        "Untuk menuju ke lokasi, anda harus berjalan menyusuri trek yang tersedia kurang lebih 30 menit. Tapi, banyak banget spot bagusnya. Suasananya juga hijau dan adem banget.",
                "Jl. Kp. Ciwangun Indah Camp, Cihanjuang Rahayu, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat",
                -6.7905639,
                107.5804501,
                R.drawable.curug_tilu_leuwi_opat));

        listwisata.add(new Wisata(
                "Saung Angklung Udjo",
                "Saung Angklung Udjo merupakan tempat wisata budaya terkenal di Bandung. Ditempat yang menfokuskan diri pada pelestarian angklung ini di gelar pertunjukan rutin pentas seni yang terdiri dari orkestra angklung, tari topeng, helaran dan wayang golek.\n" +
                        "\n" +
                        "Saung Angklung Udjo mengenalkan lebih jauh seni dan budaya Sunda dengan alat musik yang terbuat dari bambu tersebut.",
                "Jl. Padasuka No.118, Pasirlayung, Kec. Cibeunying Kidul, Kota Bandung, Jawa Barat",
                -6.8980267,
                107.6527763,
                R.drawable.saung_angklung_udjo));

        listwisata.add(new Wisata(
                "Museum Geologi Bandung",
                "Tempat wisata edukasi ini terletak di jalan Diponegoro, sangat dekat dengan Gedung Sate dan Taman Lansia. Museum ini memiliki koleksi fosil, bebatuan, mineral dan peta (geologi, geofisika, gunung api, geomorfologi, dsb) yang dipastikan dapat menarik rasa ingin tahu pengunjung anak-anak bahkan dewasa.\n" +
                        "\n" +
                        "Mungkin hal yang paling menarik di museum ini bagi pengunjung anak-anak adalah fosil-fosil replika dari binatang purba, terutama fosil dinosaurus.",
                "Jl. Diponegoro No.57, Cihaur Geulis, Kec. Cibeunying Kaler, Kota Bandung, Jawa Barat",
                -6.9007109,
                107.6192666,
                R.drawable.museum_geologi_bandung));

        listwisata.add(new Wisata(
                "Maribaya Resort and Spa Bandung",
                "Maribaya sekarang sudah berbeda dengan Maribaya yang dulu. Dibawah management yang baru, tempat ini direnovasi dan berubah nama menjadi Maribaya resort and spa. Terletak tidak jauh dari pusat kota Lembang, cocok sekali buat anda kunjungi. Btw, hati-hati dengan oknum “guide” disini ya.",
                "Jl. Maribaya No.105/212, Langensari, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.8307399,
                107.652966,
                R.drawable.maribaya_resort));

        listwisata.add(new Wisata(
                "Situ Cisanti Bandung",
                "Situ Cisanti merupakan hulu sungai Citarum. Siapa sangka, hulu sungai yang membelah Bandung ini ternyata indah sekali. Suasananya masih alami, Buat penggemar wisata alam pasti akan betah.\n" +
                        "\n" +
                        "Jika anda mencari tempat wisata alam di Bandung yang maih cukup asri, Situ Cisanti bisa anda masukan ke dalam list liburan.",
                "Neglawangi, Kertasari, Bandung, Jawa Barat",
                -7.2085306,
                107.6557625,
                R.drawable.situ_cisanti_bandung));

        listwisata.add(new Wisata(
                "Taman Hutan Raya Ir. H. Djuanda",
                "Taman Hutan Raya terletak di kawasan Dago Pakar, membentang sampai ke daerah Maribaya. Di tempat yang merupakan taman hutan raya pertama di Indonesia ini terdapat kurang lebih 2500 jenis tanaman.\n" +
                        "\n" +
                        "Selain wisata botani, di taman ini juga terdapat beberapa objek wisata yang dapat dikunjungi, antara lain:\n" +
                        "\n" +
                        "1. Monumen Ir. H. Djuanda\n" +
                        "2. Gua Jepang dan Gua Belanda\n" +
                        "3. Air Terjun Dago\n" +
                        "4. Air Terjun Omas\n" +
                        "5. Air Terjun Lalay\n" +
                        "6. Museum Ir.H Djuanda\n" +
                        "7. Prasasti Raja Thailand\n" +
                        "Dengan suhu udara yang selalu sejuk dan suasana yang tenang, Taman Hutan Raya cocok dijadikan tempat berkumpul, bersantai dan bercengkrama bersama keluarga dan teman Anda.",
                "Kompleks Tahura, Jl. Ir. H. Juanda No.99, Ciburial, Kec. Cimenyan, Bandung, Jawa Barat",
                -6.8565864,
                107.630478,
                R.drawable.hutan_raya_ir_h_djuanda));

        listwisata.add(new Wisata(
                "Curug Cimahi Bandung",
                "Curug cimahi merupakan salah satu wisata alam alternatif yang dekat serta mudah dijangkau, namun masih banyak orang yang tidak tahu. Meskipun namanya curug cimahi, tapi air terjun ini malahan terletak tidak jauh dari lembang.\n" +
                        "\n" +
                        "Suasana di area curug cimahi Bandung alami dan tertata baik, anda bisa menikmati air terjun yang tinggi dengan air yang jernis, plus suasana alami yang indah.\n" +
                        "\n" +
                        "Di malam hari, dibelakang air terjun diterangi dengan lampu warna-warni. Sekarang tempat ini dikenal juga dengan nama air terjun pelangi. Unik dan indah juga.",
                "Jl. Kolonel Masturi No.325, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat",
                -6.7992567,
                107.5753423,
                R.drawable.curug_cimahi));

        listwisata.add(new Wisata(
                "Farmhouse Lembang",
                "Sebagai salah satu tempat wisata lembang baru, Farm house Lembang mulai beroperasi sekitar tahun 2015. Tempat wisata di Bandung biasanya terbantu naik oleh medsos, terutama facebook dan instagram. Tampaknya tempat ini memaksimalkan banget hal ini.\n" +
                        "\n" +
                        "Dengan desain atmosfer eropa, banyak spot unik yang pastinya bakal menarik untuk swafoto/selfie, dan di posting di media sosial. memang, Farmhouse Lembang sejauh ini menawarkan ‘wisata foto’ sebagai daya tarik utamanya. Mirip-mirip dengan Dago Dream Park, hanya berbeda konsep tempatnya saja.\n" +
                        "\n" +
                        "Areanya sendiri sebenarnya cukup luas. Tapi di waktu Weekend bisa penuh banget sehingga terkesan sempit dan itu-itu aja." + "\n Meskipun demikian, tempat liburan ini cocok juga dikunjungi bersama keluarga dan sikecil; ada beberapa kandang binatang yang unik, pasti menarik buat anak kecil.",
                "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.9173146,
                107.6101119,
                R.drawable.farmhouse_lembang));

        listwisata.add(new Wisata(
                "Kebun Teh Sukawana Kertawangi",
                "Kebun Teh Sukawana berada di bawah PTPN VIII, termasuk dalam kebun Bukit unggul, bagian Sukawana. Sebelumnya, area ini dikenal dengan nama ‘pangheotan‘. Katanya, nama ini berasal dari nama Van Houten, seorang meneer Belanda yang memiliki perkebunan disini." + "\n"
                        + "Sekarang, PTPN VIII lebih mengangkat nama Sukawana untuk menyebut daerah perkebunan teh ini.Di sini, terdapat juga pabrik pengolahan teh. Katanya, hasil olahan teh dari sini lebih diutamakan untuk export." + "\nArea perkebunannya sendiri saya pikir tidak seluas perkebunan teh di Bandung yang lain seperti rancabali, ciwalini, dan lain sebagainya. Meskipun demikian karena termasuk perkebunan teh yang aktif produksi, area kebun tehnya terpelihara dan asri.\n" +
                        "\n" +
                        "Dari sini kita bisa menikmati gunung Burangrang dan Tangkuban perahu yang seolah tepat berada didepan mata. Tempat ini cocok sekali jadi tempat wisata alam alternatif di Bandung.",
                "",
                -6.7769018,
                107.5817124,
                R.drawable.kebun_teh_sukawana));

        listwisata.add(new Wisata(
                " Dusun Bambu Lembang",
                "Dusun Bambu Bandung mulai dikenal publik sekitar awal tahun 2014. Dari awal beroperasi, langsung menyedot banyak pengunjung. Wajar saja sih, hal yang ditawarkan oleh tempat ini terhitung baru dan membawa suasana ‘segar’.\n" +
                        "\n" +
                        "Dulu, tempat wisata di Lembang rasanya seperti itu-itu saja. Keberadaan Dusun Bambu membawa pilihan suasana baru bagi wisatawan yang berkunjung ke Bandung.\n" +
                        "\n" +
                        "Mengusung konsep eco friendly, tempat wisata di Bandung ini direncakan menjadi salah satu tempat eco wisata di jawa barat.\n" +
                        "\n" +
                        "Area dusun bambu sendiri terhitung luas, dan di tata dengan baik. Tersedia area kuliner, restoran unik, berbagai permainan, tempat menginap berupa villa dan glamping, dan juga taman terbuka yang luas. Semuanya terkonsep dengan baik.\n" +
                        "\n",
                "Jl. Kolonel Masturi No.KM, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
                -6.7894709,
                107.5766398,
                R.drawable.dusun_bambu_lembang));

        listwisata.add(new Wisata(
                "Tebing Keraton Bandung",
                "Tebing Keraton Bandung yang terletak di daerah Dago Bandung merupakan tempat wisata lokal yang booming dengan bantuan sosial media. Jika anda pengguna sosial media seperti instagram, path, facebook,dll maka kemungkinan akan menemukan info atau foto tempat ini.\n" +
                        "\n" + "Tebing keraton atau bukit keraton merupakan satu bukit dengan tebing terjal yang menghadap langsung ke area Taman Hutan Raya Juanda Bandung. Ditambah dengan background gunung tangkuban perahu, menambah keindahan area ini.\n" +
                        "\n" +
                        "Tempat wisata di Bandung ini mulai dikenal di sosial media kurang lebih bulan Juli 2014, tapi karena keindahannya dengan cepat dikenal dan dikunjungi. Tidak jarang pula orang menyebut area tebing keraton sebagai bukit instagram, karena banyaknya pengguna sosmed yang posting foto tebing keraton di instagram." + "\n" + "Anda suka selfie? background pemandangan ditempat ini layak buat anda abadikan. Daya tarik tempat ini adalah lokasinya yang berada di sisi tebing, berhadapan langsung dengan area taman hutan raya Juanda.\n" +
                        "\n" +
                        "Di waktu-waktu tertentu, terutama di pagi hari, anda bisa melihat lautan kabut yang menutupi area hutan raya. Indah banget pokoknya!\n" +
                        "\n" +
                        "Destinasi wisata alam di Bandung ini lebih direkomendasikan untuk dikunjungi di pagi hari. Jika anda penyuka fotografi, pemandangan sunrise ataupun sunset dari tebing ini layak untuk diabadikan. Banyak juga pengguna Drone yang hunting video di sini.",
                "Ciburial, Kec. Cimenyan, Kabupaten Bandung Barat, Jawa Barat 40198",
                -6.834063,
                107.6614264,
                R.drawable.tebing_keraton_bandung));

        listwisata.add(new Wisata(
                "The Lodge Maribaya",
                "The Lodge Maribaya adalah salah satu tempat wisata di Lembang yang menawarkan berbagai hal pada pengunjung. Disini kita bisa melakukan berbagai akitivitas seperti camping, trekking mengelilingi area hutan pinus yang indah, acara gathering dan team building, atau bahkan hanya sekedar refreshing menikmati kuliner.\n" +
                        "\n" +
                        "Terdapat juga berbagai wahana yang pastinya instagrammable banget. Di kelilingi oleh pegunungan dengan hutan pinus yang khas, udara dan suasana disini memang segar banget.\n" +
                        "\n" +
                        "Ingin mengadakan private gathering, atau bahkan acara pernikahan disini? bisa banget. Dengan backdrop pegunungan hijau yang indah, tentunya bakal membuat acara anda lebih berkesan.\n" +
                        "\n" +
                        "Jika dilihat dari berbagai review di internet, tempat ini lebih cocok disebut wisata foto karena memang memanjakan pengunjung yang ingin berfoto dengan sudut dan background yang indah.",
                "Jalan Maribaya No. 149/252 RT. 03 / RW. 15 Babakan, Gentong, Cibodas, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.8294059,
                107.6852779,
                R.drawable.the_lodge_maribaya));

        listwisata.add(new Wisata(
                "Ciwidey Valley Hot Spring Water Park",
                "Ciwidey Valley Hot Spring Water Park berada di kawasan Ciwidey, tepat sebelum kawah putih. Disini kita bisa menikmati berbagai permainan di waterpark air panas yang tersedia.\n" +
                        "\n" +
                        "Selain itu juga terdapat cottage dan hotel untuk menginap. Cocok bagi anda yang berlibur ke area Bandung selatan.",
                "Jl. Barutunggul KM. 17, Ciwidey, Alamendah, Rancabali, Alamendah, Kec. Rancabali, Bandung, Jawa Barat",
                -7.1348877,
                107.4137617,
                R.drawable.ciwidey_valey_resort));


        listwisata.add(new Wisata(
                "Trans Studio Bandung",
                "Berada di dalam Trans Studio Mall di jalan Gatot Subroto 289, indoor theme park ini direkomendasikan banget buat anda kunjungi. Berbagai wahana permainan keren, dengan suasana yang unik pasti bakal bikin asyik liburan anda sekeluarga.\n" +
                        "\n" +
                        "Meskipun indoor, wahana yang tersedia lengkap lho. Mulai dari Giant Swing, Vertigo, Sky Pirates, Captain Black Heart Pirate Ship, sampai dengan roller coaster juga ada!",
                "Jalan Jendral Gatot Subroto No.289 A, Cibangkong, Batununggal, Bandung City, Jawa Barat",
                -6.9256321,
                107.6342151,
                R.drawable.trans_studio_bandung));

        listwisata.add(new Wisata(
                "Taman Begonia Lembang",
                "Taman Begonia Bandung terletak pada ketinggian 1200 meter di atas laut. Selain balinea, ada beraneka jenis bunga lainnya seperti salvia, impatiens, geranium, dan celosia. Saking indahnya banyak orang yang menyebut setara dengan taman Himawari no Sato di Jepang." + "\n" +
                        "\nBunga Balinea itu sendiri merupakan jenis bunga Begonia yang berasal dari Bali. Tanaman yang cocok ditanam di berbagai cuaca ini akan tumbuh di sepanjang musim. Bunga Balinea adalah tanaman yang sering ditanam di perkebunan dan pekarangan hotel serta taman kota\n" +
                        "\n" +
                        "Keistimewaan Taman Bunga Begonia bukan hanya dari keberadaan bunga dan tanaman yang ada, melainkan juga dari tatanan taman yang menarik. Warna-warni taman bunga juga dilengkapi dengan berbagai bentukan yang cocok untuk berfoto-foto. Bahkan memang banyak pengunjung yang datang ke sini hanya untuk mengabadikan keindahan tamannya." + "Selain itu, karena berada di dataran tinggi, para pengunjung pasti akan nyaman beraktivitas di sana dengan suhu yang sejuk dan menyegarkan.",
                "Jl. Maribaya No.120 A, Langensari, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.826011,
                107.6361677,
                R.drawable.taman_begonia_lembang));

        listwisata.add(new Wisata(
                "De Ranch Lembang",
                "Awalnya, tempat ini merupakan peternakan kuda biasa. Namun melihat potensi yang ada, akhirnya dikembangkan menjadi wisata keluarga dengan mengusung konsep koboy yang kental.\n" +
                        "\nMulai dari tahun 2007, areal ini mulai dibuka untuk umum sebagai tempat wisata menunggang kuda di Lembang. Jadi, De Ranch Lembang termasuk salah satu tempat wisata senior di Lembang." + "\n" +
                        "\nSedikit demi sedikit, tempat ini terus berbenah dan mengembangkan fasilitasnya. Akhirnya sekarang menajdi salah satu tempat wisata di Bandung yang favorit. Pengunjung lokal maupun dari luar kota rasanya kurang afdol kalau berkunjung ke Lembang, tapi ngga datang ke De Ranch." + "\n" +
                        "\nSekarang, wahana permainan dan fasilitasnya sudah terbilang lengkap. Ada wahana permainan anak, outbond, area kuliner, permainan air, dan lain sebagainya. " + "\n" +
                        "\nDengan area lapangan hijau yang luas, suasananya keren abis. Anak anda pasti senang berlarian disini.",
                "Jl. Maribaya No.17, Kayuambon, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.8151229,
                107.6244745,
                R.drawable.de_ranch_lembang));

        listwisata.add(new Wisata(
                "Ranca Upas Ciwidey",
                "Kawasan ini berada di atas ketinggian 1700 mdpl. Sehingga, berada di kawasan ini merupakan yang terindah dan yang terbaik dengan suhu dingin yang bisa mencapai 17 derajat. Atau dalam kondisi normal bisa mencapai 20 derajat. Sebuah suasana yang pasti mampu mengusir segalan penat dan tuntutan pekerjaan serta kehidupan." + "\n" + "Selain memiliki suhu yang bisa juga menembus 0 derajat pada saat malam hari. Ranca Upas memiliki bumi perkemahan dengan luas kurang lebih 251 hektar. Terletak di area hutan lindung dan menjadi sebuah kawasan konservasi.",
                "Jl. Raya Ciwidey - Patengan No.KM. 11, Patengan, Kec. Rancabali, Bandung, Jawa Barat",
                -7.1381453,
                107.3900279,
                R.drawable.ranca_upas));

        listwisata.add(new Wisata(
                "Dago Dream Park",
                "Salah satu tempat wisata terdekat dari pusat kota. Berlokasi di kawasan Dago Giri yang tidak jauh dari area Dago atas, tempat wisata keluarga di Bandung ini termasuk salah satu yang favorit dikunjungi. Dago dream park cukup dekat dari pusat kota, bisa jadi alternatif bagi anda yang ingin berwisata bersama keluarga, tapi malas pergi jauh ke area Lembang atau Bandung selatan.\n" +
                        "\n" +
                        "\nTerdapat banyak wahana permainan untuk anak, spot berfoto yang unik dan indah, disertai dengan fasilitas yang cukup lengkap. Jika anda mencari tempat main di Bandung yang tidak terlalu jauh, bisa berkunjung ke sini saja ya.",
                "Jl. Dago Giri Km. 2.2 Mekarwangi, Pagerwangi, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.8473998,
                107.6233324,
                R.drawable.dago_dream_park));

        listwisata.add(new Wisata(
                "Orchid Forest Cikole Lembang",
                "Salah satu tempat hits di Bandung nih. Orchid Forest Cikole merupakan tempat wisata sekaligus budidaya anggrek yang keren banget. Di sini terdapat banyak tempat berfoto yang epic, dan pastinya bakal nge hits kalau di upload ke medsos. Selain itu juga, terdapat berbagai koleksi anggrek yang indah. Koleksi anggrek yang dimiliki oleh Orchid Forest Cikole termasuk yang terbesar di Indonesia lho." +
                        "\n" +
                        "\nTempat ini berada di Cikole. Anda cukup arahkan kendaraan ke arah Tangkuban Perahu, nanti sebelumnya akan melewati tempat ini.",
                "Genteng, Cikole, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.7804877,
                107.6352863,
                R.drawable.orchid_forest_lembang));

        listwisata.add(new Wisata(
                "Sanghyang Heuleut",
                "Satu tempat eksotis yang menyimpan peninggalan purba di Bandung; Sanghyang Heuleut. Konon, Sangyang Heuleut merupakan salah satu peninggalan alam dari danau purba yang melingkupi area Bandung di jaman dulu kala. Sekarang, tempat ini jadi salah satu tujuan wisata alam alternatif. Asyik juga, kita bisa menikmati alam sambil melihat peninggalan geologis dataran Bandung disini.",
                "Kp, Cipanas, Rajamandala Kulon, Kec. Cipatat, Kabupaten Bandung Barat, Jawa Barat",
                -6.8765078,
                107.3400296,
                R.drawable.sahyang_heuleut));

        listwisata.add(new Wisata(
                "Sendang Geulis Kahuripan",
                "Nama Sendang Geulis Kahuripan mungkin masih asing di dengar oleh Sobat maklum saja, kawasan ini memang tergolong masih baru. Lagipula, tempatnya yang berada di pelosok kabupaten Bandung Barat. Sehingga, butuh waktu yang cukup lama menjadikan tempat ini ikon baru pariwisata bandung." +
                        "\n" +
                        "\nWilayah ini lebih tepatnya berada di RPH Cikalong Wetan, BKPH Padalarang Perum Perhutani BKPH Bandung Utara." +
                        "\n" +
                        "Dilihat dari kawasannya, mengingatkan saya kepada salah satu objek wisata yang berada di jawa tengah. Lebih tepatnya berada di klaten, Umbul Ponggok namanya. Bagi Sobat yang sudah pernah ke Umbul Ponggok, objek wisata sendang ini hampir sama persis. Hanya saja, di kawasan ini digunakan secara serba guna." +
                        "\n" +
                        "\nMaksud dari serba guna adalah. Sumber mata air yang keluar dari objek wisata ini digunakan juga oleh sebagian masyarakat sekitar sebagai tempat mencuci. Tunggu dulu, jangan merasa jijik dahulu. Sumber mata air yang menghasilkan sendang ini hampir setiap menit mengalir air-air bersih." +
                        "\n" +
                        "\nJadi, Sobat bisa tenang bila berada di kawasan ini. Air yang Sobat gunakan untuk berendam ini dijamin tingkat kebersihannya. Dan dijamin pula tingkat kejernihannya yang pasti akan memukau mata." ,
                "Ganjarsari, Kec. Cikalong Wetan, Kabupaten Bandung Barat, Jawa Barat",
                -6.7495215,
                107.4764693,
                R.drawable.sendang_geulis_kahuripan));

        listwisata.add(new Wisata(
                "Grafika Cikole",
                "Bertempat di Lembang, Grafika Cikole menawarkan tempat makan sekaligus berbagai spot dan kegiatan menarik untuk keluarga. Lokasinya tidak jauh dari Kawah Tangkuban Perahu, ataupun tempat lainnya di Lembang." +
                        "\n" +
                        "\nNgga cuma itu saja, anda juga bisa menginap di berbagai lokasi yang tersedia disini. Tentunya bakal asyik banget, karena tempatnya berada ditengah hutan pinus Cikole yang rindang.",
                "Jalan Tangkuban Perahu KM.8, Cikole, Lembang, Cikole, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                -6.7852398,
                107.6495577,
                 R.drawable.grafika_cikole));

        listwisata.add(new Wisata(
                "Rabbit Town Bandung",
                "Pertama kali memasuki kawasan ini sobat akan disuguhkan dengan liburan khas luar negeri yang begitu menawan. Menariknya lagi, kawasan ini baru saja diresmikan oleh gubernur jawa barat langsung pada tanggal 11 januari 2018. Jadi, sebentar lagi usia tempat ini tepat 1 tahun." +
                        "\n" +
                        "\nKonsep yang diusung di kawasan ini memang sedikit berbeda daripada yang lain. Karena, menawarkan beberapa wisata menarik seperti kuliner, belanja, seni dan budaya serta hiburan yang sangat seru. Bisa dikatakan satu tempat untuk semua kebutuhan liburan sobat. Menarik sekali bukan, tidak usah kemana-mana disini semua sudah ada." + "\nDengan luas kawasan mencapai 2 hektar dan terdiri dari 30 ruangan membuat sobat native pasti akan sangat puas. Nah, biasanya waktu yang dibutuhkan untuk mengunjungi kawasan ini dari 2 jam hingga 4 jam. Semua tergantung dari bagaimana kegilaan sobat native saat berada di depan kamera." + "\nBila berada di sini mungkin sobat harus berpikir untuk menambah amunisi penyimpanan. Lantaran tidak hanya ada di dalam saja. titik spot selfienya juga hadir di luar ruangan pula. Sehingga, akan amat disayangkan bila tidak mengambil gambar di setiap sudutnya.",
                "Jl. Rancabentang No.30-32, Ciumbuleuit, Kec. Cidadap, Kota Bandung, Jawa Barat",
                -6.8669465,
                107.6078972,
                R.drawable.rabbit_town_bandung
        ));

    }

    private void tampilwisata() {
        AdapterLocation adapterWisata;
        recyclerViewWisata.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterWisata = new AdapterLocation(getContext(), listwisata);
        recyclerViewWisata.setAdapter(adapterWisata);

        adapterWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = listwisata.get(recyclerViewWisata.getChildAdapterPosition(view)).getNama();
                Toast.makeText(getContext(), "Lokasi : " + nama, Toast.LENGTH_SHORT).show();
                mainView.detailwisata(listwisata.get(recyclerViewWisata.getChildAdapterPosition(view)));
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity){
            this.activity = (Activity) context;
            mainView = (MainView) this.activity;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
