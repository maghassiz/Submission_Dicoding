package com.example.magha.submission_dicoding;

import java.util.ArrayList;

public class TanamanData {
    private static String[] tanamanName = {
            "pisang",
            "singkong",
            "kelapa",
            "teratai",
            "bambu",
            "jagung",
            "jeruk",
            "mangga",
            "bakau",
            "talas"
    };

    private static String[] tanamanDetail = {
      "Pisang adalah nama umum yang diberikan pada tumbuhan terna raksasa berdaun besar memanjang dari suku Musaceae. Beberapa jenisnya (Musa acuminata, M. balbisiana, dan M. ×paradisiaca) menghasilkan buah konsumsi yang dinamakan sama. Buah ini tersusun dalam tandan dengan kelompok-kelompok tersusun menjari yang disebut sisir. Hampir semua buah pisang memiliki kulit berwarna kuning ketika matang, meskipun ada beberapa yang berwarna jingga, merah, hijau, ungu, atau bahkan hampir hitam. Buah pisang sebagai bahan pangan merupakan sumber energi (karbohidrat) dan mineral, terutama kalium.",
      "Tanaman singkong memiliki nama yang banyak.  Ada yang menyebutnya ketela pohon atau ubi kayu. Sedangkan nama ilmiahnya adalah Manihot esculenta. Mulai dari tahun 1952 singkong mulai dikenal oleh masyarakat khususnya petani di Jawa.  Kalau asalnya sebenarnya dari Brazilia.",
      "Kelapa (Cocos nucifera) adalah anggota tunggal dalam marga Cocos dari suku aren-arenan atau Arecaceae. Arti kata kelapa (atau coconut, dalam bahasa Inggris) dapat merujuk pada keseluruhan pohon kelapa, biji, atau buah, yang secara botani adalah pohon berbuah, bukan pohon kacang-kacangan. Istilah ini berasal dari kata Portugis dan Spanyol abad ke-16, coco yang berarti \"kepala\" atau \"tengkorak\" setelah tiga lekukan pada tempurung kelapa yang menyerupai fitur wajah. Tumbuhan ini dimanfaatkan hampir semua bagiannya oleh manusia sehingga dianggap sebagai tumbuhan serbaguna, terutama bagi masyarakat pesisir. Kelapa juga adalah sebutan untuk buah yang dihasilkan tumbuhan ini.Kelapa dikenal karena kegunaannya yang beragam, mulai dari makanan hingga kosmetik. Daging bagian dalam dari benih matang membentuk bagian yang secara teratur menjadi sumber makanan bagi banyak orang di daerah tropis dan subtropis. Kelapa berbeda dari buah-buahan lain karena endosperma mereka mengandung sejumlah besar cairan bening, disebut \"santan\" dalam literatur, dan ketika belum matang, dapat dipanen untuk diminum sebagai \"air kelapa\", atau juga disebut \"jus kelapa\". Tumbuhan ini diperkirakan berasal dari pesisir Samudra Hindia di sisi Asia, tetapi kini telah menyebar luas di seluruh pantai tropika dunia.",
      "Teratai (Nymphaea) adalah nama genus untuk tanaman air dari suku Nymphaeaceae. Dalam bahasa Inggris dikenal sebagai water-lily atau waterlily. Di Indonesia, teratai juga digunakan untuk menyebut tanaman dari genus Nelumbo (lotus). Pada zaman dulu, orang memang sering mencampuradukkan antara tanaman genus Nelumbo seperti seroja dengan genus Nymphaea (teratai). Pada Nelumbo, bunga terdapat di atas permukaan air (tidak mengapung), kelopak bersemu merah (teratai berwarna putih hingga kuning), daun berbentuk lingkaran penuh dan rimpangnya biasa dikonsumsi. Tanaman tumbuh di permukaan air yang tenang. Bunga dan daun terdapat di permukaan air, keluar dari tangkai yang berasal dari rizoma yang berada di dalam lumpur pada dasar kolam, sungai atau rawa. Tangkai terdapat di tengah-tengah daun. Daun berbentuk bundar atau bentuk oval yang lebar yang terpotong pada jari-jari menuju ke tangkai. Permukaan daun tidak mengandung lapisan lilin sehingga air yang jatuh ke permukaan daun tidak membentuk butiran air. Bunga terdapat pada tangkai yang merupakan perpanjangan dari rimpang. Diameter bunga antara 5–10 cm. Teratai terdiri dari sekitar 50 spesies yang tersebar dari wilayah tropis hingga daerah subtropis seluruh dunia. Teratai yang tumbuh di daerah tropis berasal dari Mesir.",
      "Bambu adalah tanaman jenis rumput-rumputan dengan rongga dan ruas di batangnya. Bambu memiliki banyak tipe. Nama lain dari bambu adalah buluh, aur, dan eru. Di dunia ini bambu merupakan salah satu tanaman dengan pertumbuhan paling cepat. Karena memiliki sistem rhizoma-dependen unik, dalam sehari bambu dapat tumbuh sepanjang 60 cm (24 Inchi) bahkan lebih, tergantung pada kondisi tanah dan klimatologi tempat ia ditanam.",
      "Jagung (Zea mays ssp. mays) adalah salah satu tanaman pangan penghasil karbohidrat yang terpenting di dunia, selain gandum dan padi. Bagi penduduk Amerika Tengah dan Selatan, bulir jagung adalah pangan pokok, sebagaimana bagi sebagian penduduk Afrika dan beberapa daerah di Indonesia. Pada masa kini, jagung juga sudah menjadi komponen penting pakan ternak. Penggunaan lainnya adalah sebagai sumber minyak pangan dan bahan dasar tepung maizena. Berbagai produk turunan hasil jagung menjadi bahan baku berbagai produk industri farmasi, kosmetika, dan kimia. Jagung merupakan tanaman model yang menarik, khususnya di bidang biologi dan pertanian. Sejak awal abad ke-20, tanaman ini menjadi objek penelitian genetika yang intensif, dan membantu terbentuknya teknologi kultivar hibrida yang revolusioner. Dari sisi fisiologi, tanaman ini tergolong tanaman C4 sehingga sangat efisien memanfaatkan sinar matahari. Dalam kajian agronomi, tanggapan jagung yang dramatis dan khas terhadap kekurangan atau keracunan unsur-unsur hara penting menjadikan jagung sebagai tanaman percobaan fisiologi pemupukan yang disukai. ",
      "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan). Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis. Rasa masam berasal dari kandungan asam sitrat yang memang menjadi terkandung pada semua anggotanya. Sebutan \"jeruk\" kadang-kadang juga disematkan pada beberapa anggota marga lain yang masih berkerabat dalam suku yang sama, seperti kingkit. Dalam bahasa sehari-hari, penyebutan \"jeruk\" atau \"limau\" (di Sumatra dan Malaysia) seringkali berarti \"jeruk keprok\" atau \"jeruk manis\". Di Jawa, \"limau\" (atau \"limo\") berarti \"jeruk nipis\". Jeruk sangatlah beragam dan beberapa spesies dapat saling bersilangan dan menghasilkan hibrida antarspesies ('interspecific hybrid) yang memiliki karakter yang khas, yang berbeda dari spesies tetuanya. Keanekaragaman ini seringkali menyulitkan klasifikasi, penamaan dan pengenalan terhadap anggota-anggotanya, karena orang baru dapat melihat perbedaan setelah bunga atau buahnya muncul. Akibatnya tidak diketahui dengan jelas berapa banyak jenisnya. Penelitian-penelitian terakhir menunjukkan adalah keterkaitan kuat Citrus dengan genus Fortunella (kumkuat), Poncirus, serta Microcitrus dan Eremocitrus, sehingga ada kemungkinan dilakukan penggabungan. Citrus sendiri memiliki dua anakmarga (subgenus), yaitu Citrus dan Papeda. Asal jeruk adalah dari Asia Timur dan Asia Tenggara, membentuk sebuah busur yang membentang dari Jepang terus ke selatan hingga kemudian membelok ke barat ke arah India bagian timur. Jeruk manis dan sitrun (lemon) berasal dari Asia Timur, sedangkan jeruk bali, jeruk nipis dan jeruk purut berasal dari Asia Tenggara. Banyak anggota jeruk yang dimanfaatkan oleh manusia sebagai bahan pangan, wewangian, maupun industri. Buah jeruk adalah sumber vitamin C dan wewangian/parfum penting. Daunnya juga digunakan sebagai rempah-rempah. ",
      "Mangga atau mempelam adalah nama sejenis buah, demikian pula nama pohonnya. Mangga termasuk ke dalam marga Mangifera, yang terdiri dari 35-40 anggota dan suku Anacardiaceae. Pohon mangga termasuk tumbuhan tingkat tinggi yang struktur batangnya (habitus) termasuk kelompok arboreus, yaitu tumbuhan berkayu yang mempunyai tinggi batang lebih dari 5 m. Mangga bisa mencapai tinggi antara 10 hingga 40 m. Nama \"mangga\" berasal dari bahasa Malayalam maanga. Kata ini dibawa ke Eropa oleh orang-orang Portugis dan diserap menjadi manga (bahasa Portugis), mango (bahasa Inggris) dan lain-lain. Berasal dari daerah di sekitar perbatasan India dengan Burma, mangga telah menyebar ke Asia Tenggara sekurang-kurangnya semenjak 1500 tahun yang silam. Buah ini dikenal pula dalam berbagai bahasa daerah, seperti pelem atau poh (Jw.). ",
      "Hutan bakau atau disebut juga hutan mangrove adalah hutan yang tumbuh di air payau,dan dipengaruhi oleh pasang-surut air laut. Hutan ini tumbuh khususnya di tempat-tempat di mana terjadi pelumpuran dan akumulasi bahan organik. Baik di teluk-teluk yang terlindung dari gempuran ombak, maupun di sekitar muara sungai di mana air melambat dan mengendapkan lumpur yang dibawanya dari hulu. Ekosistem hutan bakau bersifat khas, baik karena adanya pelumpuran yang mengakibatkan kurangnya abrasi tanah; salinitas tanahnya yang tinggi; serta mengalami daur penggenangan oleh pasang-surut air laut. Hanya sedikit jenis tumbuhan yang bertahan hidup di tempat semacam ini, dan jenis-jenis ini kebanyakan bersifat khas hutan bakau karena telah melewati proses adaptasi dan evolusi.",
      "Talas atau talas bogor (Colocasia esculenta L., suku talas-talasan atau Araceae) merupakan tumbuhan penghasil umbi-umbian yang cukup penting. Diduga asli berasal dari Asia Tenggara atau Asia Tengah bagian selatan, talas diperkirakan telah dibudidayakan manusia sejak zaman purba, bahkan pada zaman sebelum padi ditanam orang. Kini talas telah menyebar ke berbagai belahan dunia, termasuk India, Cina, Afrika Barat dan Utara, dan Hindia Barat. Talas merupakan makanan pokok, selain sukun, di beberapa kepulauan di Oseania. Di Indonesia, talas populer ditanam di hampir semua daerah. Nama-nama daerahnya banyak yang senada dengan perkataan talas dan keladi, misalnya talé, kĕladi, sukat, suhat, seuhat, suwat (Bat.); taro (Nias); taléh, kaladi, kuladi (Min.); talos, kĕladi (Lamp.); talĕs, kĕladi, kujang, luèh (Day.); taleus, bolang (Sd.); tales, janawari (Jw.); talĕs, kaladi (Md.); talĕs, kladi (Bl.); talé, koladi, kolai, kolei, korei, kore (aneka dialek di Sulut); aladi, suli, kosi, paco (Sulsel); lole, ufi lole (Timor); inane, inano, inan, ina wuu, ronan, kětu, etu, hakar, wakal, gwal (berbagai pulau di Maluku); bètè, ota, dilago, komo (Maluku Utara); nomo, uma, warimu, hèkérè, sèkéré, ifen, yéfam (Papua). Sementara talas dalam bahasa Inggris disebut taro, old cocoyam, dasheen, dan eddoe. "
    };

    private static int[] image = {
      R.drawable.pisang,
      R.drawable.singkong,
      R.drawable.kelapa,
      R.drawable.teratai,
      R.drawable.bambu,
      R.drawable.jagung,
      R.drawable.jeruk,
      R.drawable.mangga,
      R.drawable.bakau,
      R.drawable.talas
    };

    static ArrayList<Tanaman> getListData(){
        ArrayList<Tanaman> list = new ArrayList<>();
        for(int position = 0; position < tanamanName.length; position++){
            Tanaman tanaman = new Tanaman();
            tanaman.setName(tanamanName[position]);
            tanaman.setDetail(tanamanDetail[position]);
            tanaman.setPhoto(image[position]);
            list.add(tanaman);
        }
        return list;
    }
}
