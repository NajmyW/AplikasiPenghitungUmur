
# Aplikasi Penghitung Umur

## Deskripsi Program
Aplikasi ini dirancang untuk menghitung umur berdasarkan tanggal lahir yang dipilih oleh pengguna melalui komponen JDateChooser. Setelah pengguna menekan tombol "Hitung", aplikasi akan menampilkan umur pengguna dalam hitungan tahun, bulan, dan hari.

## Fitur Utama
- Memilih tanggal lahir menggunakan JDateChooser.
- Menghitung umur dalam tahun, bulan, dan hari.
- Terdapat informasi tambahan seperti hitungan hari menuju ulang tahun berikutnya.
- Mendukung integrasi dengan API eksternal untuk menampilkan peristiwa penting berdasarkan tanggal lahir pengguna.

## Komponen GUI
Aplikasi ini dibangun menggunakan komponen GUI berikut:
- `JFrame`
- `JPanel`
- `JLabel`
- `JDateChooser`
- `JButton`
- `JTextField`

## Logika Program
Logika aplikasi ini menggunakan **LocalDate** untuk memanipulasi tanggal dan menghitung selisih waktu antara tanggal lahir yang dipilih dan tanggal saat ini. Aplikasi akan menghitung dan menampilkan umur pengguna dengan format tahun, bulan, dan hari.

## Events
- **ActionListener** pada tombol "Hitung" untuk memicu perhitungan umur.
- **PropertyChangeListener** pada komponen JDateChooser untuk mendeteksi perubahan tanggal yang dipilih oleh pengguna.

## Variasi Fitur
1. Informasi tambahan seperti hari ulang tahun berikutnya disediakan untuk pengguna.
2. Aplikasi mendukung integrasi API eksternal yang memungkinkan pengguna untuk melihat peristiwa penting berdasarkan tanggal lahir.

## Prasyarat
Sebelum memulai, pastikan Anda telah menginstal:
- **Apache NetBeans 23**
- **JDK versi 23**
- **JCalendar** (untuk menggunakan komponen JDateChooser)
- JSON-Java (untuk menggunakan API Eksternal)

## Cara Menggunakan
1. Buka Apache NetBeans dan buat proyek Java baru.
2. Tambahkan komponen GUI di dalam JFrame dan JPanel yang sudah disediakan oleh NetBeans.
3. Gunakan `JDateChooser` untuk membiarkan pengguna memilih tanggal lahir mereka.
4. Tambahkan ActionListener pada tombol "Hitung" untuk menghitung umur berdasarkan tanggal yang dipilih.
5. Hasil perhitungan akan ditampilkan di dalam JTextField.

## Instalasi
1. Clone repository ini ke dalam direktori lokal:
   ```bash
   git clone https://github.com/NajmyW/AplikasiPenghitungUmur.git
   ```
2. Buka proyek menggunakan **Apache NetBeans**.
3. Pastikan semua dependensi telah terpasang dengan benar.
4. Jalankan proyek menggunakan tombol "Run" di NetBeans.

---
